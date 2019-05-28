package com.company;

public class Triangle
{
    private int sideA;
    private int sideB;
    private int sideC;

    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }

    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }

    public void setSideC(int sideC)
    {
        this.sideC = sideC;
    }

    public int getSideA()
    {
        return sideA;
    }

    public int getSideB()
    {
        return sideB;
    }

    public int getSideC()
    {
        return sideC;
    }

    public double angleA()
    {
        double sideAsq = sideA * sideA;
        double sideBsq = sideB * sideB;
        double sideCsq = sideC * sideC;

        double angleA = Math.acos((sideBsq + sideCsq - sideAsq) / (2 * sideB * sideC));
        return Math.toDegrees(angleA);
    }

    public double angleB()
    {
        double sideAsq = sideA * sideA;
        double sideBsq = sideB * sideB;
        double sideCsq = sideC * sideC;

        double angleB = Math.acos((sideCsq + sideAsq - sideBsq) / (2 * sideA * sideC));
        return Math.toDegrees(angleB);
    }

    public double angleC()
    {
        double sideAsq = sideA * sideA;
        double sideBsq = sideB * sideB;
        double sideCsq = sideC * sideC;

        double angleC = Math.acos((sideAsq + sideBsq - sideCsq) / (2 * sideA * sideB));
        return Math.toDegrees(angleC);
    }

    public String getPerimeter()
    {
        return "The perimeter of the triangle is: " + (sideA + sideB + sideC);
    }

    public String isEquilateral()
    {
        if (sideA == sideB && sideB == sideC)
        {
            return "The triangle is equilateral: " + true;
        }
        return "The triangle is equilateral: " + false;
    }

    public String isIsosceles()
    {
        if (sideA == sideB && sideB != sideC && sideA != sideC)
        {
            return "The triangle is isosceles: " + true;
        }
        else if (sideA != sideB && sideB == sideC && sideA != sideC)
        {
            return "The triangle is isosceles: " + true;
        }
        else if (sideA != sideB && sideB != sideC && sideA == sideC)
        {
            return "The triangle is isosceles: " + true;
        }
        return "The triangle is isosceles: " + false;
    }

    public String isScalene()
    {
        if (sideA != sideB && sideB != sideC && sideA != sideC)
        {
            return "The triangle is scalene: " + true;
        }
        return "The triangle is scalene: " + false;
    }

    public String isValid()
    {
        if ((sideA + sideB) > sideC)
        {
            return "This is a valid triangle: " + true;
        }
        else if ((sideB + sideC) > sideA)
        {
            return "This is a valid triangle: " + true;
        }
        else if ((sideA + sideC) > sideB)
        {
            return "This is a valid triangle: " + true;
        }
        else
        {
            return "This is a valid triangle: " + false;
        }
    }

    public String isRightAngle()
    {
        if ((sideA * sideA + sideB * sideB) == (sideC * sideC))
        {
            return "This triangle has a right angle: " + true;
        }
        else if ((sideC * sideC + sideB * sideB) == (sideA * sideA))
        {
            return "This triangle has a right angle: " + true;
        }
        else if ((sideA * sideA + sideC * sideC) == (sideB * sideB))
        {
            return "This triangle has a right angle: " + true;
        }
        else
        {
            return "This triangle has a right angle: " + false;
        }
    }

    public String isObtuseAngle()
    {
        if (angleA() > 90)
        {
            return "This triangle has an obtuse angle: " + true;
        }
        else if (angleB() > 90)
        {
            return "This triangle has an obtuse angle: " + true;
        }
        else if (angleC() > 90)
        {
            return "This triangle has an obtuse angle: " + true;
        }
        else
        {
            return "This triangle has an obtuse angle: " + false;
        }
    }

    public String isAcuteAngle()
    {
        if (angleA() < 90 && angleB() < 90 && angleC() < 90)
        {
            return "This triangle is an acute triangle: " + true;
        }
        else
        {
            return "This triangle is an acute triangle: " + false;
        }
    }

}
