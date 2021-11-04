package com.appslab;

public class Triangle {
    public int Sidea;
    public int Sideb;
    public int Sidec;

    public Triangle (int sidea, int sideb, int sidec){
        Sidea = sidea;
        Sideb = sideb;
        Sidec = sidec;
    }

    public int getSidea() {
        return Sidea;
    }

    public int getSideb() {
        return Sideb;
    }

    public int getSidec() {
        return Sidec;
    }

    public static int getArea(int Sidea, int Sideb, int Sidec)
    {
        return Sidea+Sidec/2;
    }
    public static int getPerimeter(int Sidea, int Sideb, int Sidec)
    {
        return Sidea+Sideb+Sidec;

    }
}
