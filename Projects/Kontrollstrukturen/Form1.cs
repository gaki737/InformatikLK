using System;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Kontrollstrukturen
{
    public partial class mainForm : Form
    {

        public mainForm()
        {
            InitializeComponent();
        }

        //Parsen eines strings zu einem integer mitsamt rückgabe
        //fehlerausgabe in form einer messagebox bei fehlerhaftem übergabewert

        private int ParseInt(string value)
        {
            int converted;
            if (!int.TryParse(value, out converted))
            {
                MessageBox.Show(value + " ist keine Zahl!");

            }
            return converted;
        }

        //parsen eines strings zu einem double mitsamt rückgabe
        //fehlerausgabe in form einer messagebox bei fehlerhaftem übergabewert

        private double ParseDouble(string value)
        {
            double converted;
            if (!double.TryParse(value, out converted))
            {
                MessageBox.Show(value + " ist keine Zahl!");
            }
            return converted;
        }

        //Handler für das clickevent des buttons 
        //aufruf der methode zum parsen des eingabestrings in ein int
        //einordnung des verhältnisses der werte zueinander über if und else if anweisungen
        //ausgabe des ergebnisses in der output-textbox

        private void BTN_groesseCheckButton_Click(object sender, EventArgs e)
        {

            int number1 = ParseInt(TB_groesseInput1.Text);
            int number2 = ParseInt(TB_groesseInput2.Text);

            if (number1 < number2)
            {
                TB_groesseOutput.Text = "Zahl1(" + number1 + ") ist kleiner als Zahl2(" + number2 + ")";
            }
            else if (number1 == number2)
            {
                TB_groesseOutput.Text = "Zahl1(" + number1 + ") entspricht Zahl2(" + number2 + ")";
            }
            else if (number1 > number2)
            {
                TB_groesseOutput.Text = "Zahl1(" + number1 + ") ist größer als Zahl2(" + number2 + ")";
            }
        }

        //methode zur überprüfung ob die übergebene zahl eine primzahl ist

        private static bool CheckPrime(int number)
        {
            int i;
            for (i = 2; i <= number - 1; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            if (i == number)
            {
                return true;
            }
            return false;
        }

        //ausgabe ob die angegebene zahl eine primzahl ist oder nicht

        private void BTN_primeCheckButton_Click(object sender, EventArgs e)
        {
            int number = ParseInt(TB_primeInput.Text);
            if (CheckPrime(number))
            {
                TB_primeOutput.Text = number + " ist eine Primzahl";
            }
            else
            {
                TB_primeOutput.Text = number + " ist keine Primzahl";
            }
        }

        //festlegen bestimmter festplattentypen
        //prüfen ob die eingabe eines dieser typen ist und entsprechende ausgabe an den user

        private void BTN_drivesCheckButton_Click(object sender, EventArgs e)
        {
            string[] driveTypes = new string[] { "hdd", "sshd", "ssd" };

            string input = TB_drivesInput.Text;

            if (driveTypes.Contains(input.ToLower()))
            {
                TB_drivesOutput.Text = input.ToUpper() + " ist ein Festplattentyp";
            }
            else
            {
                TB_drivesOutput.Text = input + " ist kein Festplattentyp";
            }
        }

        //erstellen des md5 hashcodes zum vergleichen des vordefinierten hashcodes der passwörter
        //mitsamt rückgabe

        private string CreateHash(string value)
        {
            using (System.Security.Cryptography.MD5 md5 = System.Security.Cryptography.MD5.Create())
            {
                byte[] retVal = md5.ComputeHash(Encoding.Unicode.GetBytes(value));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < retVal.Length; i++)
                {
                    sb.Append(retVal[i].ToString("x2"));
                }
                return sb.ToString();
            }
        }

        //logindaten werden mit den vordefinierten angaben verglichen und entsprechende ausgaben an den user gegebens

        private void BTN_loginButton_Click(object sender, EventArgs e)
        {

            string[] usernames = new string[] { "admin", "Bono" };
            string[] passes = new string[] { "0f037584c99e7fd4f4f8c59550f8f507", "282fd98864016f67244d28c658e4b1a6" };

            string user = TB_loginUser.Text;
            string pass = TB_loginPass.Text;

            if (usernames.Contains(user))
            {
                int index = Array.IndexOf(usernames, user);
                if (passes[index] == CreateHash(pass))
                {
                    MessageBox.Show("Login erfolgreich");
                }
                else
                {
                    MessageBox.Show("Login nicht erfolgreich");
                }
            }else
            {
                MessageBox.Show("Login nicht erfolgreich");
            }

        }
    }
}
