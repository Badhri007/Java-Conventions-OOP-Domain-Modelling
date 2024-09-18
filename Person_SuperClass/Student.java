public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name,String address,String program,int year,double fee)
    {
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    public String getProgram()
    {
        return program;
    }

    public int getYear()
    {
        return year;
    }

    public double getFee()
    {
        return fee;
    }

    public void setProgram(String newProgram)
    {
        this.program=newProgram;
    }

    public void setYear(int newYear)
    {
        this.year=newYear;
    }

    public void setFee(double newFee)
    {
        this.fee=newFee;
    }

    @Override
    public String toString()
    {
        return "Student["+super.toString()+",program="+program+",year="+year+",fee="+fee + "]";
     }


}
