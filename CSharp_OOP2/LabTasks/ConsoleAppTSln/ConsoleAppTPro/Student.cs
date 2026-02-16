using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleAppTPro
{
    public class Student : Person
    {
        public int g;
        private int h;
        protected int i;
        internal byte j;
        protected internal byte k;
        private protected string l;

        void M1()
        {
            Student s=new Student();
            
        }
    }


}
