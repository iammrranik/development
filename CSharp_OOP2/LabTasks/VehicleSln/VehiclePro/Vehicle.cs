using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace VehiclePro
{
    //internal struct RegistrationDate
    //{
    //    internal byte day, month;
    //    internal short year;

    //    internal byte Day
    //    {
    //        get { return this.day; }
    //        set { this.day = value; }
    //    }

    //    internal byte Month
    //    {
    //        get { return this.month; }
    //        set { this.month = value; }
    //    }

    //    internal short Year
    //    {
    //        get { return this.year; }
    //        set { this.year = value; }
    //    }

    //    internal RegistrationDate(byte day, byte month, short year)
    //    {
    //        this.day = day;
    //        this.month = month;
    //        this.year = year;
    //    }

    //    internal void PrintRegistrationDate()
    //    {
    //        Console.WriteLine($"Registration Date: {this.Day}/{this.Month}/{this.Year}");
    //    }
    //}

    internal class RegistrationDate
    {
        internal byte day, month;
        internal short year;

        internal byte Day
        {
            get { return this.day; }
            set { this.day = value; }
        }

        internal byte Month
        {
            get { return this.month; }
            set { this.month = value; }
        }

        internal short Year
        {
            get { return this.year; }
            set { this.year = value; }
        }

        internal RegistrationDate(byte day, byte month, short year)
        {
            this.Day = day;
            this.Month = month;
            this.Year = year;
        }

        internal void PrintRegistrationDate()
        {
            Console.WriteLine($"Registration Date: {this.Day}/{this.Month}/{this.Year}");
        }
    }

    internal class Vehicle
    {

        private string registrationNumber;
        private RegistrationDate registrationDate;
        private string color;
        private string brand;

        internal string RegistrationNumber
        {
            get { return this.registrationNumber; }
            set { this.registrationNumber = value; }
        }

        internal RegistrationDate RegistrationDate
        {
            get { return this.registrationDate; }
            set { this.registrationDate = value; }
        }

        internal string Color
        {
            get { return this.color; }
            set { this.color = value; }
        }

        internal string Brand
        {
            get { return this.brand; }
            set { this.brand = value; }
        }

        //internal Vehicle() { }

        internal Vehicle(string registrationNumber, RegistrationDate registrationDate, string color, string brand)
        {
            this.RegistrationNumber= registrationNumber;
            this.RegistrationDate= registrationDate;
            this.color= color;
            this.brand= brand;
        }

        internal virtual void PrintInfo()
        {
            Console.WriteLine($"Registration Number: {this.RegistrationNumber}");
            this.RegistrationDate.PrintRegistrationDate();
            Console.WriteLine($"Color: {this.Color}");
            Console.WriteLine($"Brand: {this.Brand}");
        }

        internal virtual void VehiclePerformance()
        {
        }
    }
}
