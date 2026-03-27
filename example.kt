fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")
    
    for (county in counties) {
    
        if (county == counties[0] || county == counties[2]) {
            print("$county ")
        }
        
    } 
}