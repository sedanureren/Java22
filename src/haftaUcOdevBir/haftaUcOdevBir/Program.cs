using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace haftaUcOdevBir
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager() );
            customerManager.GiveCredit();
            Console.ReadLine();













            /*
             referanslar
             int sayi1 = 10;
             int sayi2 = 20;
             sayi1 = sayi2; ;
             sayi2 = 100;
             Console.WriteLine(sayi1);
             int[] sayilar1 = new[] { 1, 2, 3, 4, 5, 6 };
             int[] sayilar2 = new[] { 10,20,30 };
             sayilar2[0] = 1000;
             Console.WriteLine(sayilar1[0]);*/
            /*CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Save();
            

            Customer customer = new Customer();//örneği oluşturmak,instance oluşturmak,instance creadtion
            customer.Id = 1;
            customer.City = "ankara";
            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.Save(customer);
            Company company= new Company();
            company.TaxNumber = "10";
            company.CompanyName = "arçeli";
            company.Id = 1;
            
            CustomerManager customerManager1=new CustomerManager(new Person());


            Person person=new Person();
            person.NationalIdentity = "123";
                Console.ReadLine();

            Customer customer2=new Customer();
            Customer customer1= new Person();
            Customer customer3 = new Company();*/






        }
    }
    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("hesaplandı");

        }
        public void Save()
        {
            Console.WriteLine("verildi");

        }
    }
    interface ICreditManager
    {
        void Calculate();
        void Save();
    }
    abstract class BaseKrediManager:ICreditManager
    {
        public abstract void Calculate();
        public virtual void Save()
        {
           Console.WriteLine("kaydedildi");
        }
    }
    class TeacherCreditManager : BaseKrediManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("ogretmen kredisi hesaplandı");
        }
        public override void Save()
        {
            base.Save();
        }

    }

    class MilitaryCreditManager : BaseKrediManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("asker kredisi hesaplandı");
        }

    }
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("musteri olusturuldu");
            
        }
        public int Id;
        public string Name { get; set; }
        public string LastName { get; set; }
        public string City {get; set; }

    }
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer,ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
         public void Save(Customer customer)
    {
        Console.WriteLine("musteri kaydedildi: ");
    }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("kredi ver");
        }
}
    class Company: Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    class Person : Customer
    {
        public string NationalIdentity { get; set; }
    }


}
