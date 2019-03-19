package com.jpugh

class Receptionsit {
string recepName
string recepEmail
string recepUsername
string recepPassword
int recepPhone


    static constraints = {
recepName blank:false, nullable:false
recepEmail blank:false, nullable:false, email:true
recepUsername blank:false, nullable:false, unique:true
recepPassword blank:false, nullable:false
recepPhone blank:false, nullable:false min:7, max:12
    }
}
