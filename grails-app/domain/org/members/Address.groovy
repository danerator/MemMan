package org.members

class Address {

    String streetAddress;
    String city;
    String state;
    String zipCode;

    Date newMemDate;
    Date expMemDate;

    static belongsTo = [person: Person]

    static constraints = {
        streetAddress(blank: false)
        city(blank: false)
        state(blank: false, size: 2..2)
        zipCode(blank: false, size: 5..5, validator: {val, obj -> val?.isNumber()})
        newMemDate(nullable: true, max:  new Date())
        expMemDate(nullable: true, validator: { val, obj ->
            val?.after(obj.newMemDate)
        })
    }
}