namespace WindowsFormsAppPro0
{
    partial class FormStart
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.btnShow = new System.Windows.Forms.Button();
            this.panel3 = new System.Windows.Forms.Panel();
            this.rbMasters = new System.Windows.Forms.RadioButton();
            this.rbBachelors = new System.Windows.Forms.RadioButton();
            this.dtpDateOfBirth = new System.Windows.Forms.DateTimePicker();
            this.cmbDepartment = new System.Windows.Forms.ComboBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtPassword = new System.Windows.Forms.TextBox();
            this.lbl3 = new System.Windows.Forms.Label();
            this.txtUsername = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.txtOutputUsername = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.lblProgram = new System.Windows.Forms.Label();
            this.lblDateOfBirth = new System.Windows.Forms.Label();
            this.lblDepartment = new System.Windows.Forms.Label();
            this.lblPassword = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.panel3.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.btnShow);
            this.panel1.Controls.Add(this.panel3);
            this.panel1.Controls.Add(this.dtpDateOfBirth);
            this.panel1.Controls.Add(this.cmbDepartment);
            this.panel1.Controls.Add(this.label6);
            this.panel1.Controls.Add(this.label5);
            this.panel1.Controls.Add(this.label4);
            this.panel1.Controls.Add(this.txtPassword);
            this.panel1.Controls.Add(this.lbl3);
            this.panel1.Controls.Add(this.txtUsername);
            this.panel1.Controls.Add(this.label2);
            this.panel1.Controls.Add(this.label1);
            this.panel1.Location = new System.Drawing.Point(12, 12);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(346, 513);
            this.panel1.TabIndex = 0;
            // 
            // btnShow
            // 
            this.btnShow.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnShow.Location = new System.Drawing.Point(116, 429);
            this.btnShow.Name = "btnShow";
            this.btnShow.Size = new System.Drawing.Size(105, 34);
            this.btnShow.TabIndex = 14;
            this.btnShow.Text = "Show";
            this.btnShow.UseVisualStyleBackColor = true;
            this.btnShow.Click += new System.EventHandler(this.btnShow_Click_1);
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.rbMasters);
            this.panel3.Controls.Add(this.rbBachelors);
            this.panel3.Location = new System.Drawing.Point(150, 280);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(174, 57);
            this.panel3.TabIndex = 13;
            // 
            // rbMasters
            // 
            this.rbMasters.AutoSize = true;
            this.rbMasters.Font = new System.Drawing.Font("Times New Roman", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rbMasters.Location = new System.Drawing.Point(3, 29);
            this.rbMasters.Name = "rbMasters";
            this.rbMasters.Size = new System.Drawing.Size(85, 23);
            this.rbMasters.TabIndex = 16;
            this.rbMasters.TabStop = true;
            this.rbMasters.Text = "Masters";
            this.rbMasters.UseVisualStyleBackColor = true;
            // 
            // rbBachelors
            // 
            this.rbBachelors.AutoSize = true;
            this.rbBachelors.Font = new System.Drawing.Font("Times New Roman", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rbBachelors.Location = new System.Drawing.Point(3, 3);
            this.rbBachelors.Name = "rbBachelors";
            this.rbBachelors.Size = new System.Drawing.Size(99, 23);
            this.rbBachelors.TabIndex = 14;
            this.rbBachelors.TabStop = true;
            this.rbBachelors.Text = "Bachelors";
            this.rbBachelors.UseVisualStyleBackColor = true;
            // 
            // dtpDateOfBirth
            // 
            this.dtpDateOfBirth.CustomFormat = "dd-MM-yyyy";
            this.dtpDateOfBirth.Format = System.Windows.Forms.DateTimePickerFormat.Custom;
            this.dtpDateOfBirth.Location = new System.Drawing.Point(150, 236);
            this.dtpDateOfBirth.Name = "dtpDateOfBirth";
            this.dtpDateOfBirth.Size = new System.Drawing.Size(174, 22);
            this.dtpDateOfBirth.TabIndex = 12;
            // 
            // cmbDepartment
            // 
            this.cmbDepartment.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbDepartment.FormattingEnabled = true;
            this.cmbDepartment.Items.AddRange(new object[] {
            "CSE",
            "EEE",
            "BBA",
            "MBA",
            "IPE"});
            this.cmbDepartment.Location = new System.Drawing.Point(150, 190);
            this.cmbDepartment.Name = "cmbDepartment";
            this.cmbDepartment.Size = new System.Drawing.Size(174, 24);
            this.cmbDepartment.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(21, 280);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(76, 19);
            this.label6.TabIndex = 9;
            this.label6.Text = "Program";
            this.label6.Click += new System.EventHandler(this.label6_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(21, 236);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(110, 19);
            this.label5.TabIndex = 7;
            this.label5.Text = "Date Of Birth";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(21, 190);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(97, 19);
            this.label4.TabIndex = 5;
            this.label4.Text = "Department";
            // 
            // txtPassword
            // 
            this.txtPassword.Location = new System.Drawing.Point(150, 139);
            this.txtPassword.Name = "txtPassword";
            this.txtPassword.PasswordChar = '$';
            this.txtPassword.Size = new System.Drawing.Size(174, 22);
            this.txtPassword.TabIndex = 4;
            this.txtPassword.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // lbl3
            // 
            this.lbl3.AutoSize = true;
            this.lbl3.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl3.Location = new System.Drawing.Point(21, 139);
            this.lbl3.Name = "lbl3";
            this.lbl3.Size = new System.Drawing.Size(81, 19);
            this.lbl3.TabIndex = 3;
            this.lbl3.Text = "Password";
            this.lbl3.Click += new System.EventHandler(this.label3_Click);
            // 
            // txtUsername
            // 
            this.txtUsername.Location = new System.Drawing.Point(150, 91);
            this.txtUsername.Name = "txtUsername";
            this.txtUsername.Size = new System.Drawing.Size(174, 22);
            this.txtUsername.TabIndex = 2;
            this.txtUsername.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txtUsername.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(21, 91);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(83, 19);
            this.label2.TabIndex = 1;
            this.label2.Text = "Username";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(112, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(109, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "Information";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.lblProgram);
            this.panel2.Controls.Add(this.lblDateOfBirth);
            this.panel2.Controls.Add(this.lblDepartment);
            this.panel2.Controls.Add(this.lblPassword);
            this.panel2.Controls.Add(this.label3);
            this.panel2.Controls.Add(this.txtOutputUsername);
            this.panel2.Controls.Add(this.label9);
            this.panel2.Controls.Add(this.label7);
            this.panel2.Controls.Add(this.label10);
            this.panel2.Controls.Add(this.label8);
            this.panel2.Controls.Add(this.label11);
            this.panel2.Location = new System.Drawing.Point(377, 12);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(393, 513);
            this.panel2.TabIndex = 1;
            // 
            // txtOutputUsername
            // 
            this.txtOutputUsername.Location = new System.Drawing.Point(174, 94);
            this.txtOutputUsername.Name = "txtOutputUsername";
            this.txtOutputUsername.ReadOnly = true;
            this.txtOutputUsername.Size = new System.Drawing.Size(174, 22);
            this.txtOutputUsername.TabIndex = 16;
            this.txtOutputUsername.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(140, 36);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(70, 23);
            this.label7.TabIndex = 15;
            this.label7.Text = "Output";
            this.label7.Click += new System.EventHandler(this.label7_Click);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(45, 94);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(83, 19);
            this.label8.TabIndex = 15;
            this.label8.Text = "Username";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(45, 283);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(76, 19);
            this.label3.TabIndex = 18;
            this.label3.Text = "Program";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.Location = new System.Drawing.Point(45, 239);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(110, 19);
            this.label9.TabIndex = 17;
            this.label9.Text = "Date Of Birth";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(45, 193);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(97, 19);
            this.label10.TabIndex = 16;
            this.label10.Text = "Department";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label11.Location = new System.Drawing.Point(45, 142);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(81, 19);
            this.label11.TabIndex = 15;
            this.label11.Text = "Password";
            // 
            // lblProgram
            // 
            this.lblProgram.AutoSize = true;
            this.lblProgram.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblProgram.Location = new System.Drawing.Point(170, 283);
            this.lblProgram.Name = "lblProgram";
            this.lblProgram.Size = new System.Drawing.Size(76, 19);
            this.lblProgram.TabIndex = 22;
            this.lblProgram.Text = "Program";
            // 
            // lblDateOfBirth
            // 
            this.lblDateOfBirth.AutoSize = true;
            this.lblDateOfBirth.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDateOfBirth.Location = new System.Drawing.Point(170, 239);
            this.lblDateOfBirth.Name = "lblDateOfBirth";
            this.lblDateOfBirth.Size = new System.Drawing.Size(110, 19);
            this.lblDateOfBirth.TabIndex = 21;
            this.lblDateOfBirth.Text = "Date Of Birth";
            // 
            // lblDepartment
            // 
            this.lblDepartment.AutoSize = true;
            this.lblDepartment.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDepartment.Location = new System.Drawing.Point(170, 193);
            this.lblDepartment.Name = "lblDepartment";
            this.lblDepartment.Size = new System.Drawing.Size(97, 19);
            this.lblDepartment.TabIndex = 20;
            this.lblDepartment.Text = "Department";
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.Location = new System.Drawing.Point(170, 142);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(81, 19);
            this.lblPassword.TabIndex = 19;
            this.lblPassword.Text = "Password";
            // 
            // FormStart
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(782, 553);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "FormStart";
            this.Text = "Form Start Page";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.TextBox txtUsername;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtPassword;
        private System.Windows.Forms.Label lbl3;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.ComboBox cmbDepartment;
        private System.Windows.Forms.DateTimePicker dtpDateOfBirth;
        private System.Windows.Forms.RadioButton rbMasters;
        private System.Windows.Forms.RadioButton rbBachelors;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Button btnShow;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox txtOutputUsername;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label lblProgram;
        private System.Windows.Forms.Label lblDateOfBirth;
        private System.Windows.Forms.Label lblDepartment;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
    }
}