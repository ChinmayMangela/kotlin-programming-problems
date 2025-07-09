package null_safety

/*
Problem 1: Nullable Data Class Properties
Imagine an API response where some fields might be optional.
Task: Define a data class called UserProfile with the following properties: id (Int), username (String), bio (String?, can be null), website (String?, can be null).
Task: Create two UserProfile instances:
One where bio and website are both null.
One where bio and website have non-null values.
Task: Write a function printProfile(profile: UserProfile) that prints the username. If bio is not null, print it. If website is not null, print it. Otherwise, print "No additional info." for any missing optional fields. Use safe calls and Elvis operators appropriately.
 */


fun main() {
    val clarion = UserProfile(
        id = 2,
        userName = "Clarion",
        bio = "Nyctophile",
        website = "https://clarion.com"
    )

    val anesthesia = UserProfile(
        id = 3,
        userName = "Anesthesia",
        bio = null,
        website = null
    )

    printProfile(clarion)
    printProfile(anesthesia)
}


fun printProfile(userProfile: UserProfile) {
    val name = userProfile.userName
    val bio = userProfile.bio ?: "No additional info"
    val website = userProfile.website ?: "No additional info"
    println("Name: $name\nBio: $bio\nWebsite: $website\n")
}



data class UserProfile(
    val id: Int,
    val userName: String,
    val bio: String?,
    val website: String?
)




