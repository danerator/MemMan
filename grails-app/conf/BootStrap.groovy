import org.members.Person
import org.members.Address

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) {
            def johnDeer = new Person( firstName: "John", lastName: "Deer" ).save(failOnError: true)
            def jerryReed = new Person( firstName: "Jerry", lastName: "Reed" ).save(failOnError: true)
            def travisBickle = new Person( firstName: "Travis", lastName: "Bickle" ).save(failOnError: true)
            def guntherHitler = new Person( firstName: "Gunther", lastName: "Hitler" ).save(failOnError: true)
            def mohammedBarfolopogous = new Person( firstName: "Mohammed", lastName: "Barfolopogous" ).save(failOnError: true)

            johnDeer.addToAddresses(
                    new Address(state: "KY", city: "Hicksville", streetAddress: "666 W 1nd St", zipCode: "55334")
            ).addToAddresses(
                    new Address(state: "TX", city: "Alberta", streetAddress: "117 W 2nd St", zipCode: "55555")
            ).addToAddresses(
                    new Address(state: "NY", city: "Longely", streetAddress: "2 Sandy Creek", zipCode: "34009")
            ).addToAddresses(
                    new Address(state: "ME", city: "Ladly", streetAddress: "117 W 2nd St", zipCode: "55533")
            ).addToAddresses(
                    new Address(state: "KY", city: "Korba", streetAddress: "3 Apple St", zipCode: "40351")
            ).save(failOnError: true)

            jerryReed.addToAddresses(
                    new Address(state: "KY", city: "Frankfort", streetAddress: "33 Main St", zipCode: "77625")
            ).addToAddresses(
                    new Address(state: "PA", city: "Scranton", streetAddress: "71 Kind Ave Apt 3", zipCode: "44567")
            ).addToAddresses(
                    new Address(state: "PA", city: "Scranton", streetAddress: "8559 Hard Rock", zipCode: "44567")
            ).addToAddresses(
                    new Address(state: "WV", city: "Charleston", streetAddress: "8233 Juniper Rd", zipCode: "33982")
            ).save(failOnError: true)

            travisBickle.addToAddresses(
                    new Address(state: "PA", city: "Blue Ridge", streetAddress: "780 Country Rd", zipCode: "44564")
            ).addToAddresses(
                    new Address(state: "TX", city: "Ft. Worth", streetAddress: "55 Holdem Dr." , zipCode: "77298")
            ).save(failOnError: true)

            guntherHitler.addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "1 Beach Rd", zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "53 Sinking Dr." , zipCode: "98765")
            ).save(failOnError: true)

            mohammedBarfolopogous.addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "1 Beach Rd", zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "53 Sinking Dr." , zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "759 Sinking Dr." , zipCode: "98765")
            ).save(failOnError: true)

         }
    }
    def destroy = {
    }
}