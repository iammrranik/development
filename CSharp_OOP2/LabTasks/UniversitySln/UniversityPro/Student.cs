using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UniversityPro
{
    internal class Student : Person
    {
        private float cgpa;

        internal float Cgpa
        {
            get { return cgpa; }
            set { cgpa = value; }
        }

        internal Student(string name, string dept, float cgpa) : base(name, dept)
        {
            Cgpa = cgpa;
        }

        internal override void PrintId()
        {
            base.PrintId();
            Console.WriteLine("-S");
        }

        internal override void PrintInfo()
        {
            PrintId();
            base.PrintInfo();
        }

    }
}
