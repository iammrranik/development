using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Principal;
using System.Text;
using System.Threading.Tasks;

namespace UniversityPro
{

    internal abstract class Person
    {
        private static int id = 1;
        //private int id;
        private string name;
        private string dept;
        //private string dateOfBirth;

        internal Person(string name, string dept)
        {
            id++;
            Id=id;
            Name=name;
            Dept=dept;
        }

        internal int Id{
            get{return id;}
            set{ id = value; }
        }

        internal string Name
        {
            get{return this.name;}
            set{ this.name = value; }
        }

        internal string Dept
        {
            get { return this.dept;}
            set { this.dept = value; }
        }

        internal virtual void PrintId()
        {
            Console.Write("P-"+Id);
        }

        internal virtual void PrintInfo()
        {
            //Console.WriteLine("Id: ");
            //PrintId();
            Console.WriteLine("Name: "+Name);
            Console.WriteLine("Department: "+Dept);
        }

    }
}
