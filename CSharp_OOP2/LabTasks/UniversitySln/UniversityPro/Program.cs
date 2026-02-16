using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UniversityPro
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Person person = new Student("Anik", "CSE", 1.11f);
            Person person1 = new Student("Anika", "EEE", 3.11f);
            Person person2 = new Student("Anikaa", "COE", 2.11f);
            person.PrintInfo();
            person1.PrintInfo();
            person2.PrintInfo();
        }
    }
}
