package com.knoldus.task5;

public class Salesperson {
    //salesperson details
    String name;
    int id;
    TotalSales sale;

    public Salesperson(String john, int i, TotalSales sale) {
        this.name = name;
        this.id = id;
        this.sale = sale;
    }

    void printTotalSale() {
        System.out.println("Monthly sale : " + sale.monthly_sale);
        System.out.println("Quarterly sale : " + sale.quarterly_sale);
        System.out.println("Yearly sale : " + sale.yearly_sale);
    }

    public static void main(String[] args) {
        TotalSales totalsales = new TotalSales(1000, 10000, 20000);
        Salesperson salesperson = new Salesperson("John", 121, totalsales);
        System.out.println("Total sales of the salesperson is : " );
        salesperson.printTotalSale();


    }

}


