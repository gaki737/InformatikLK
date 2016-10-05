namespace Kontrollstrukturen
{
    partial class mainForm
    {
        /// <summary>
        /// Erforderliche Designervariable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Verwendete Ressourcen bereinigen.
        /// </summary>
        /// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Vom Windows Form-Designer generierter Code

        /// <summary>
        /// Erforderliche Methode für die Designerunterstützung.
        /// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
        /// </summary>
        private void InitializeComponent()
        {
            this.TB_groesseInput1 = new System.Windows.Forms.TextBox();
            this.LBL_groesseNumber1 = new System.Windows.Forms.Label();
            this.LBL_groesseNumber2 = new System.Windows.Forms.Label();
            this.TB_groesseInput2 = new System.Windows.Forms.TextBox();
            this.BTN_groesseCheckButton = new System.Windows.Forms.Button();
            this.TB_groesseOutput = new System.Windows.Forms.TextBox();
            this.TB_primeInput = new System.Windows.Forms.TextBox();
            this.LBL_primeZahl = new System.Windows.Forms.Label();
            this.TB_primeOutput = new System.Windows.Forms.TextBox();
            this.BTN_primeCheckButton = new System.Windows.Forms.Button();
            this.TB_drivesInput = new System.Windows.Forms.TextBox();
            this.LBL_drives = new System.Windows.Forms.Label();
            this.TB_drivesOutput = new System.Windows.Forms.TextBox();
            this.BTN_drivesCheckButton = new System.Windows.Forms.Button();
            this.TB_loginUser = new System.Windows.Forms.TextBox();
            this.TB_loginPass = new System.Windows.Forms.TextBox();
            this.BTN_loginButton = new System.Windows.Forms.Button();
            this.LBL_loginUser = new System.Windows.Forms.Label();
            this.LBL_loginPass = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // TB_groesseInput1
            // 
            this.TB_groesseInput1.Location = new System.Drawing.Point(12, 29);
            this.TB_groesseInput1.Name = "TB_groesseInput1";
            this.TB_groesseInput1.Size = new System.Drawing.Size(100, 22);
            this.TB_groesseInput1.TabIndex = 0;
            // 
            // LBL_groesseNumber1
            // 
            this.LBL_groesseNumber1.AutoSize = true;
            this.LBL_groesseNumber1.Location = new System.Drawing.Point(9, 8);
            this.LBL_groesseNumber1.Name = "LBL_groesseNumber1";
            this.LBL_groesseNumber1.Size = new System.Drawing.Size(48, 17);
            this.LBL_groesseNumber1.TabIndex = 1;
            this.LBL_groesseNumber1.Text = "Zahl 1";
            // 
            // LBL_groesseNumber2
            // 
            this.LBL_groesseNumber2.AutoSize = true;
            this.LBL_groesseNumber2.Location = new System.Drawing.Point(9, 57);
            this.LBL_groesseNumber2.Name = "LBL_groesseNumber2";
            this.LBL_groesseNumber2.Size = new System.Drawing.Size(44, 17);
            this.LBL_groesseNumber2.TabIndex = 2;
            this.LBL_groesseNumber2.Text = "Zahl2";
            // 
            // TB_groesseInput2
            // 
            this.TB_groesseInput2.Location = new System.Drawing.Point(12, 77);
            this.TB_groesseInput2.Name = "TB_groesseInput2";
            this.TB_groesseInput2.Size = new System.Drawing.Size(100, 22);
            this.TB_groesseInput2.TabIndex = 3;
            // 
            // BTN_groesseCheckButton
            // 
            this.BTN_groesseCheckButton.Location = new System.Drawing.Point(118, 50);
            this.BTN_groesseCheckButton.Name = "BTN_groesseCheckButton";
            this.BTN_groesseCheckButton.Size = new System.Drawing.Size(88, 24);
            this.BTN_groesseCheckButton.TabIndex = 4;
            this.BTN_groesseCheckButton.Text = "Prüfen";
            this.BTN_groesseCheckButton.UseVisualStyleBackColor = true;
            this.BTN_groesseCheckButton.Click += new System.EventHandler(this.BTN_groesseCheckButton_Click);
            // 
            // TB_groesseOutput
            // 
            this.TB_groesseOutput.Location = new System.Drawing.Point(12, 105);
            this.TB_groesseOutput.Name = "TB_groesseOutput";
            this.TB_groesseOutput.ReadOnly = true;
            this.TB_groesseOutput.Size = new System.Drawing.Size(269, 22);
            this.TB_groesseOutput.TabIndex = 5;
            // 
            // TB_primeInput
            // 
            this.TB_primeInput.Location = new System.Drawing.Point(12, 163);
            this.TB_primeInput.Name = "TB_primeInput";
            this.TB_primeInput.Size = new System.Drawing.Size(100, 22);
            this.TB_primeInput.TabIndex = 6;
            // 
            // LBL_primeZahl
            // 
            this.LBL_primeZahl.AutoSize = true;
            this.LBL_primeZahl.Location = new System.Drawing.Point(12, 142);
            this.LBL_primeZahl.Name = "LBL_primeZahl";
            this.LBL_primeZahl.Size = new System.Drawing.Size(117, 17);
            this.LBL_primeZahl.TabIndex = 7;
            this.LBL_primeZahl.Text = "Zahl von 0 bis 10";
            // 
            // TB_primeOutput
            // 
            this.TB_primeOutput.Location = new System.Drawing.Point(12, 192);
            this.TB_primeOutput.Name = "TB_primeOutput";
            this.TB_primeOutput.ReadOnly = true;
            this.TB_primeOutput.Size = new System.Drawing.Size(269, 22);
            this.TB_primeOutput.TabIndex = 8;
            // 
            // BTN_primeCheckButton
            // 
            this.BTN_primeCheckButton.Location = new System.Drawing.Point(118, 162);
            this.BTN_primeCheckButton.Name = "BTN_primeCheckButton";
            this.BTN_primeCheckButton.Size = new System.Drawing.Size(75, 24);
            this.BTN_primeCheckButton.TabIndex = 7;
            this.BTN_primeCheckButton.Text = "Prüfen";
            this.BTN_primeCheckButton.UseVisualStyleBackColor = true;
            this.BTN_primeCheckButton.Click += new System.EventHandler(this.BTN_primeCheckButton_Click);
            // 
            // TB_drivesInput
            // 
            this.TB_drivesInput.Location = new System.Drawing.Point(12, 252);
            this.TB_drivesInput.Name = "TB_drivesInput";
            this.TB_drivesInput.Size = new System.Drawing.Size(100, 22);
            this.TB_drivesInput.TabIndex = 10;
            // 
            // LBL_drives
            // 
            this.LBL_drives.AutoSize = true;
            this.LBL_drives.Location = new System.Drawing.Point(9, 232);
            this.LBL_drives.Name = "LBL_drives";
            this.LBL_drives.Size = new System.Drawing.Size(113, 17);
            this.LBL_drives.TabIndex = 11;
            this.LBL_drives.Text = "Festplattentypen";
            // 
            // TB_drivesOutput
            // 
            this.TB_drivesOutput.Location = new System.Drawing.Point(12, 281);
            this.TB_drivesOutput.Name = "TB_drivesOutput";
            this.TB_drivesOutput.ReadOnly = true;
            this.TB_drivesOutput.Size = new System.Drawing.Size(269, 22);
            this.TB_drivesOutput.TabIndex = 12;
            // 
            // BTN_drivesCheckButton
            // 
            this.BTN_drivesCheckButton.Location = new System.Drawing.Point(118, 252);
            this.BTN_drivesCheckButton.Name = "BTN_drivesCheckButton";
            this.BTN_drivesCheckButton.Size = new System.Drawing.Size(75, 23);
            this.BTN_drivesCheckButton.TabIndex = 11;
            this.BTN_drivesCheckButton.Text = "Prüfen";
            this.BTN_drivesCheckButton.UseVisualStyleBackColor = true;
            this.BTN_drivesCheckButton.Click += new System.EventHandler(this.BTN_drivesCheckButton_Click);
            // 
            // TB_loginUser
            // 
            this.TB_loginUser.Location = new System.Drawing.Point(15, 343);
            this.TB_loginUser.Name = "TB_loginUser";
            this.TB_loginUser.Size = new System.Drawing.Size(100, 22);
            this.TB_loginUser.TabIndex = 14;
            // 
            // TB_loginPass
            // 
            this.TB_loginPass.Location = new System.Drawing.Point(15, 393);
            this.TB_loginPass.Name = "TB_loginPass";
            this.TB_loginPass.Size = new System.Drawing.Size(100, 22);
            this.TB_loginPass.TabIndex = 15;
            this.TB_loginPass.UseSystemPasswordChar = true;
            // 
            // BTN_loginButton
            // 
            this.BTN_loginButton.Location = new System.Drawing.Point(118, 369);
            this.BTN_loginButton.Name = "BTN_loginButton";
            this.BTN_loginButton.Size = new System.Drawing.Size(75, 24);
            this.BTN_loginButton.TabIndex = 16;
            this.BTN_loginButton.Text = "Login";
            this.BTN_loginButton.UseVisualStyleBackColor = true;
            this.BTN_loginButton.Click += new System.EventHandler(this.BTN_loginButton_Click);
            // 
            // LBL_loginUser
            // 
            this.LBL_loginUser.AutoSize = true;
            this.LBL_loginUser.Location = new System.Drawing.Point(12, 323);
            this.LBL_loginUser.Name = "LBL_loginUser";
            this.LBL_loginUser.Size = new System.Drawing.Size(73, 17);
            this.LBL_loginUser.TabIndex = 17;
            this.LBL_loginUser.Text = "Username";
            // 
            // LBL_loginPass
            // 
            this.LBL_loginPass.AutoSize = true;
            this.LBL_loginPass.Location = new System.Drawing.Point(12, 373);
            this.LBL_loginPass.Name = "LBL_loginPass";
            this.LBL_loginPass.Size = new System.Drawing.Size(69, 17);
            this.LBL_loginPass.TabIndex = 18;
            this.LBL_loginPass.Text = "Password";
            // 
            // mainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(293, 422);
            this.Controls.Add(this.LBL_loginPass);
            this.Controls.Add(this.LBL_loginUser);
            this.Controls.Add(this.BTN_loginButton);
            this.Controls.Add(this.TB_loginPass);
            this.Controls.Add(this.TB_loginUser);
            this.Controls.Add(this.BTN_drivesCheckButton);
            this.Controls.Add(this.TB_drivesOutput);
            this.Controls.Add(this.LBL_drives);
            this.Controls.Add(this.TB_drivesInput);
            this.Controls.Add(this.BTN_primeCheckButton);
            this.Controls.Add(this.TB_primeOutput);
            this.Controls.Add(this.LBL_primeZahl);
            this.Controls.Add(this.TB_primeInput);
            this.Controls.Add(this.TB_groesseOutput);
            this.Controls.Add(this.BTN_groesseCheckButton);
            this.Controls.Add(this.TB_groesseInput2);
            this.Controls.Add(this.LBL_groesseNumber2);
            this.Controls.Add(this.LBL_groesseNumber1);
            this.Controls.Add(this.TB_groesseInput1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "mainForm";
            this.ShowIcon = false;
            this.Text = "Diverse Prüfungen";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox TB_groesseInput1;
        private System.Windows.Forms.Label LBL_groesseNumber1;
        private System.Windows.Forms.Label LBL_groesseNumber2;
        private System.Windows.Forms.TextBox TB_groesseInput2;
        private System.Windows.Forms.Button BTN_groesseCheckButton;
        private System.Windows.Forms.TextBox TB_groesseOutput;
        private System.Windows.Forms.TextBox TB_primeInput;
        private System.Windows.Forms.Label LBL_primeZahl;
        private System.Windows.Forms.TextBox TB_primeOutput;
        private System.Windows.Forms.Button BTN_primeCheckButton;
        private System.Windows.Forms.TextBox TB_drivesInput;
        private System.Windows.Forms.Label LBL_drives;
        private System.Windows.Forms.TextBox TB_drivesOutput;
        private System.Windows.Forms.Button BTN_drivesCheckButton;
        private System.Windows.Forms.TextBox TB_loginUser;
        private System.Windows.Forms.TextBox TB_loginPass;
        private System.Windows.Forms.Button BTN_loginButton;
        private System.Windows.Forms.Label LBL_loginUser;
        private System.Windows.Forms.Label LBL_loginPass;
    }
}

