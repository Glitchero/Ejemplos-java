package taller.java;

class Calculadora {
static public int factorial(int n) {
int fact=1;
while (n>0) {
fact *=n--;
}
return fact;
}
}
