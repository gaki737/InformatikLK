using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kontrollstrukturen
{
    class ConsoleVersion
    {

        private int ParseInt(string value)
        {
            int converted;
            if (!int.TryParse(value, out converted))
            {
                Console.WriteLine("{0} ist keine Zahl", value);

            }
            return converted;
        }
        private double ParseDouble(string value)
        {
            double converted;
            if (!double.TryParse(value, out converted))
            {
                Console.WriteLine("{0} ist keine Zahl", value);

            }
            return converted;
        }

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

        private void groesse()
        {
            Console.WriteLine("Erster Wert");
            int number1 = ParseInt(Console.ReadLine());
            Console.WriteLine("Zweiter Wert");
            int number2 = ParseInt(Console.ReadLine());

            if (number1 < number2)
            {
                Console.WriteLine("Zahl1(" + number1 + ") ist kleiner als Zahl2(" + number2 + ")");
            }
            else if (number1 == number2)
            {
                Console.WriteLine("Zahl1(" + number1 + ") entspricht Zahl2(" + number2 + ")");
            }
            else if (number1 > number2)
            {
                Console.WriteLine("Zahl1(" + number1 + ") ist größer als Zahl2(" + number2 + ")");
            }

        }


        private void prime()
        {
            int number = ParseInt(Console.ReadLine());
            if (CheckPrime(number))
            {
                Console.WriteLine(number + " ist eine Primzahl");
            }
            else
            {
                Console.WriteLine(number + " ist keine Primzahl");
            }
        }

        public ConsoleVersion()
        {
            start:

            Console.WriteLine("Wählen sie die Aufgabe");
            Console.WriteLine();
            Console.WriteLine("[1] Größenverhältnis zwischen zwei Werten");
            Console.WriteLine("[2] Primzahlenorüfung");
            Console.WriteLine("[3] Festplattentypen prüfen");
            Console.WriteLine("[4] Login");

            /*
            int task = int.Parse(Console.ReadKey().KeyChar.ToString());

            switch (task)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    goto start;
                    
            }
            */
        }
    }
}
