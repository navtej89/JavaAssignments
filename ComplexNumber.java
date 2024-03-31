public class ComplexNumber{
  private double real;
  private double imaginary;

  //constructor 
  public ComplexNumber(double real,double imaginary){
    this.real=real;
    this.imaginary=imaginary;
  }

  //real part
  public double getReal(){
    return real;
  }

  //imaginary part 
  public double getImaginary(){
    return imaginary;
  }

  //add
  public ComplexNumber add(ComplexNumber other) {
    return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
  }
  
  //subtract
  public ComplexNumber subtract(ComplexNumber other) {
    return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
  }

  //multiply
  public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary,this.real * other.imaginary + this.imaginary * other.real);
    }

  //divide
  public ComplexNumber divide(ComplexNumber other) {
        ComplexNumber conjugate = new ComplexNumber(other.real, -other.imaginary);
        ComplexNumber numerator = this.multiply(conjugate);
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplexNumber(numerator.real / denominator, numerator.imaginary / denominator);
    }

  //
  public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 0);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);

        ComplexNumber sum = c1.add(c2);
        System.out.println("Addition: " + sum);
        
        ComplexNumber subtraction = c1.subtract(c2);
        System.out.println("Subtraction: " + subtraction);

        ComplexNumber product = c1.multiply(c2);
        System.out.println("Multiplication: " + product);

        ComplexNumber division = c1.divide(c2);
        System.out.println("Division: " + division);
    }
}
