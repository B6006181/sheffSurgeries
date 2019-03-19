package com.jpugh

class Appointment {
Date appDate
string appTime
int appDuration
string roomNumber

    static constraints = {
appDate blank:false, nullable:false
appTime blank:false, nullable:false
appDurationblank:false, nullable:false min=10, max=60
roomNumber blank:false, nullable:false
    }
}
