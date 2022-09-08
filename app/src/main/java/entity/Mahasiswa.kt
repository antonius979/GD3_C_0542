package entity

class Mahasiswa (var name: String, var IPK: Double, var tahunMasuk: Int) {

    //companion object seperti di java dan berikut adalah array untuk menyimpan data dummy mahasiswa
    companion object{
        var listOfMahasiswa = arrayOf(
            Mahasiswa("Wendy Winata", 3.5, 2018),
            Mahasiswa("Eras Timoty", 3.7, 2018),
            Mahasiswa("Jonathan", 3.8, 2018),
            Mahasiswa("Yosia", 3.9, 2018),
            Mahasiswa("Yotam", 4.0, 2019)
        )
    }
}
