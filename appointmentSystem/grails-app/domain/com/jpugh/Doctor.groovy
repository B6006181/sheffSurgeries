package com.jpugh

class Doctor {
String fullname
String qualification
String position
String doctorEmail
String password
String doctorOffice
int doctorPhone
String bio

    static constraints = {
fullname blank:false, nullable:false
qualification blank:false, nullable:false
position blank:false, nullable:false
doctorEmail blank:false, nullable:false, email:true
password blank:false, nullable:false
doctorOffice blank:false, nullable:false
doctorPhone blank:false nullable:false, minSize:8, maxSize:15
bio blank:false nullable:false
    }
}
