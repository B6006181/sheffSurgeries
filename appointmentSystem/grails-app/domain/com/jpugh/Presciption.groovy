package com.jpugh

class Presciption {
string pharmacyName
int prescripNumber
string medicine
string totalCost
date dateIssued
boolean patientPaying

static constraints = {
pharmacyName blank:false, nullable:false
prescripNumber blank:false, nullable:false
medicine blank:false, nullable:false
totalCost blank:false, nullable:false
dateIssued blank:false, nullable:false
patientPaying blank:false, nullable:false


    
    }
}
