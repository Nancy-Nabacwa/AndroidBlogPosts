package com.nabacwaakirachix.mypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nabacwaakirachix.mypost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPosts.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        displayPosts()
    }
    fun displayPosts(){
        val post1 = Post("Nancy Nabacwa","'You Know I love me some goood food. Back With Risotto'"," ","Guide to Making Risotto","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 25, 2024"," ","View More")

        val post2 = Post("Cynthis Gertrude","'You Know I love me some sweets"," ","Guide to Making Chocolate Pie","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 26, 2024"," ","View More")

        val post3 = Post("Kwabar Agnes","'It's Love Season Get in the mood'"," ","Guide to Making Red Pie","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 27, 2024"," ","View More")

        val post4 = Post("Burger Frank","'See my name that's What I'm here for'"," ","Guide to Making Burgers","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 28, 2024"," ","View More")

        val post5 = Post("Pink Panthress","'Pink is the new Great'"," ","Guide to Making Pink Pie","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 29, 2024"," ","View More")

        val post6 = Post("Cardi Bary","'loving on em foodies'"," ","Guide to Making burritos","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","June 30, 2024"," ","View More")

        val post7 = Post("Heaven Surin","'From Origins. Back With Pilau'"," ","Guide to Making Pilau","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","July 1, 2024"," ","View More")

        val post8 = Post("Jada Pinket","'Whomp Whomp'"," ","Guide to Making Whopies","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","July 2, 2024"," ","View More")

        val post9 = Post("Kambori Frideie","'Friedie with the Fried Chicken'"," ","Guide to Making Fried Chicken","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","July 3, 2024"," ","View More")

        val post10 = Post("Rihana Risotto","'Violets Are Purple'"," ","Guide to Making Burgleries","If you’ve watched cooking shows, you’re probably a bit intimidated by making risotto. It’s even known as the “death dish” in MasterChef Australia for how often they mess it up. \uD83D\uDE31\n" +
                "\n" +
                "While I’ve been making risotto for a while now, I still decided to take a step back this week and do some research. In the process, I picked up some new tips and reaffirmed some old ones.\n" +
                "\n" +
                "So don’t sweat it. \uD83D\uDE05 You’ll ris-ot-to the occasion! \uD83D\uDE09","July 4, 2024"," ","View More")



        val postsList = listOf(post1,post2,post3,post4,post5,post6,post7,post7,post8,post9,post10)
        val postAdapter = PostAdapter(postsList)
        binding.rvPosts.adapter = postAdapter
    }
}