package com.jpugh

class Patient{
String patientName
String patientAddress
string patientResidence
int patientDob
int patientID
string dateRegistered
string patientPhone

    static constraints = {
patientName blank:false, nullable:false
patientAddress blank:false, nullalbe:false
patientResidence blank:false, nullabe:false
patientDob blank:false, nullable:false
patientID blank:false, nullable:false,unqiue:true
dateRegistered blank:false, nullable:false
patientPhone openingTime blank:false nullable:false, minSize:8, maxSize:12
    }
}
