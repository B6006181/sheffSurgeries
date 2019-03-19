package com.jpugh

class Surgery {
String name
String address
string postcode
int telephone
int numberOfPatients
string description
string openingTime

    static constraints = {
name blank:false, nullable:false
address blank:false, nullalbe:false
postcode blank:false, nullabe:false
telephone blank:false, nullable:false
numberOfPatients blank:false, nullable:false
description blank:false, nullable:false, maxsize 5000 'textarea'
openingTime blank:false nullable:false
    }
}
