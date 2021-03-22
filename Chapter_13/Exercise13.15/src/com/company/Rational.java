package com.company;


import java.math.BigInteger;

public class Rational {
    private BigInteger numerator;
    private BigInteger denominator;

    Rational(){
        this(new BigInteger("0"), new BigInteger("0"));
    }

    Rational(BigInteger numerator, BigInteger denominator){
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = (((denominator > 0) ? 1 : -1) * numerator) / gcd;;
        this.denominator = denominator;
    }
    BigInteger getNumerator(){
        return this.numerator;
    }
    BigInteger getDenominator(){
        return this.denominator;
    }
    void setNumerator(BigInteger numerator){
        this.numerator = numerator;
    }
    void setDenominator(BigInteger denominator){
        this.denominator = denominator;
    }

    private static BigInteger gcd(BigInteger numerator, BigInteger denominator){

    }
}
