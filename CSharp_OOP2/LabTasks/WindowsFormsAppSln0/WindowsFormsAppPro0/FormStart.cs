using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsAppPro0
{
    public partial class FormStart : Form
    {
        public FormStart()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }


        private void btnShow_Click_1(object sender, EventArgs e)
        {
            this.txtOutputUsername.Text = this.txtUsername.Text;
            if (this.rbBachelors.Checked)
            {
                this.lblProgram.Text = "Under Grad";
            }
            else if (this.rbMasters.Checked)
            {
                this.lblProgram.Text = "Masters";
            }
        }
    }
}
