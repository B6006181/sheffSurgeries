package com.jpugh

class Prescription {
String pharmacyName
int prescripNumber
String medicine
String totalCost
Date dateIssued
Boolean patientPaying

static constraints = {
pharmacyName blank:false, nullable:false
prescripNumber blank:false, nullable:false
medicine blank:false, nullable:false
totalCost blank:false, nullable:false
dateIssued blank:false, nullable:false
patientPaying blank:false, nullable:false


    
    }
}
