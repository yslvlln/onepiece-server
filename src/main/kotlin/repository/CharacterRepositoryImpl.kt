package com.ycosilvallana.repository

import com.ycosilvallana.models.BasePageResponse
import com.ycosilvallana.models.Character
import com.ycosilvallana.models.PagingMeta
import io.ktor.http.*

class CharacterRepositoryImpl : CharacterRepository {

    override val heroes: Map<Int, List<Character>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1: List<Character> = listOf(
        Character(
            id = 1,
            name = "Monkey D. Luffy",
            image = "/images/luffy.jpg",
            about = "The cheerful captain of the Straw Hat Pirates with a dream to become the Pirate King. He ate the Gomu Gomu no Mi (Gum-Gum Fruit), which made his body rubber-like.",
            rating = 4.9,
            power = 9500,
            month = "May",
            day = "5",
            family = listOf("Monkey D. Dragon", "Monkey D. Garp"),
            abilities = listOf("Gomu Gomu no Pistol", "Gear Second", "Gear Fourth", "Haki"),
            natureTypes = listOf("D", "Fire", "Freedom")
        ),
        Character(
            id = 2,
            name = "Roronoa Zoro",
            image = "/images/zoro.jpg",
            about = "A master swordsman who dreams of becoming the world's greatest. Uses the three-sword style (Santoryu).",
            rating = 4.8,
            power = 9100,
            month = "November",
            day = "11",
            family = listOf("Shimotsuki family (Wano origin)"),
            abilities = listOf("Three-Sword Style", "Asura", "Haki"),
            natureTypes = listOf("Steel", "Wind", "Determination")
        ),
        Character(
            id = 3,
            name = "Nami",
            image = "/images/nami.jpg",
            about = "Navigator of the Straw Hat Pirates. Genius cartographer and weather tactician who uses her Clima-Tact to manipulate the weather.",
            rating = 4.6,
            power = 7800,
            month = "July",
            day = "3",
            family = listOf("Bell-mère (adoptive mother)", "Nojiko (sister)"),
            abilities = listOf("Clima-Tact", "Weather Ball", "Thunderbolt Tempo"),
            natureTypes = listOf("Water", "Lightning", "Intelligence")
        )
    )

    override val page2: List<Character> = listOf(
        Character(
            id = 4,
            name = "Sanji",
            image = "/images/sanji.jpg",
            about = "The Straw Hat crew’s cook and a powerful martial artist who fights using his legs. He values chivalry and has the ability to use fire-based kicks.",
            rating = 4.7,
            power = 8900,
            month = "March",
            day = "2",
            family = listOf("Vinsmoke Judge", "Vinsmoke Reiju"),
            abilities = listOf("Diable Jambe", "Sky Walk", "Observation Haki"),
            natureTypes = listOf("Fire", "Air", "Pride")
        ),
        Character(
            id = 5,
            name = "Nico Robin",
            image = "/images/robin.jpg",
            about = "An archaeologist capable of reading Poneglyphs. She ate the Hana Hana no Mi, allowing her to grow body parts anywhere.",
            rating = 4.5,
            power = 8300,
            month = "February",
            day = "6",
            family = listOf("Nico Olvia", "Ohara Scholars"),
            abilities = listOf("Hana Hana no Mi", "Gigantesco Mano", "Clutch"),
            natureTypes = listOf("Earth", "Knowledge", "Dark")
        ),
        Character(
            id = 6,
            name = "Usopp",
            image = "/images/usopp.jpg",
            about = "A brave (and sometimes cowardly) sniper of the Straw Hat Pirates, known for his lies, inventions, and unmatched accuracy.",
            rating = 4.3,
            power = 7000,
            month = "April",
            day = "1",
            family = listOf("Yasopp"),
            abilities = listOf("Sniping", "Kabuto Slingshot", "Pop Green", "Observation Haki"),
            natureTypes = listOf("Plant", "Air", "Courage")
        )
    )

    override val page3: List<Character> = listOf(
        Character(
            id = 7,
            name = "Tony Tony Chopper",
            image = "/images/chopper.jpg",
            about = "The crew’s doctor and a reindeer who ate the Hito Hito no Mi, granting him human traits and intelligence. Adorable but deadly in Monster Point.",
            rating = 4.6,
            power = 7500,
            month = "December",
            day = "24",
            family = listOf("Dr. Hiriluk", "Dr. Kureha"),
            abilities = listOf("Hito Hito no Mi", "Monster Point", "Rumble Ball"),
            natureTypes = listOf("Snow", "Medicine", "Kindness")
        ),
        Character(
            id = 8,
            name = "Franky",
            image = "/images/franky.jpg",
            about = "A cyborg and shipwright of the crew who built the Thousand Sunny. Loud, eccentric, and a genius in mechanics.",
            rating = 4.5,
            power = 8600,
            month = "March",
            day = "9",
            family = listOf("Tom (mentor)"),
            abilities = listOf("Coup de Vent", "Franky Shogun", "Cola Power"),
            natureTypes = listOf("Steel", "Fire", "Innovation")
        ),
        Character(
            id = 9,
            name = "Brook",
            image = "/images/brook.jpg",
            about = "The crew’s musician who came back to life thanks to the Revive-Revive Fruit. A walking skeleton with soul-based attacks.",
            rating = 4.4,
            power = 8000,
            month = "April",
            day = "3",
            family = listOf("Rumbar Pirates"),
            abilities = listOf("Soul Solid", "Yomi Yomi no Mi", "Music Hypnosis"),
            natureTypes = listOf("Ice", "Soul", "Joy")
        )
    )

    override val page4: List<Character> = listOf(
        Character(
            id = 10,
            name = "Jinbe",
            image = "/images/jinbe.jpg",
            about = "A fish-man and master of Fish-Man Karate. Former Warlord and a wise, loyal helmsman of the Straw Hat Pirates.",
            rating = 4.7,
            power = 8800,
            month = "April",
            day = "2",
            family = listOf("Sun Pirates"),
            abilities = listOf("Fish-Man Karate", "Water Shock Punch", "Armament Haki"),
            natureTypes = listOf("Water", "Honor", "Discipline")
        ),
        Character(
            id = 11,
            name = "Shanks",
            image = "/images/shanks.jpg",
            about = "One of the Four Emperors, captain of the Red-Haired Pirates, and a key figure in Luffy’s life. Mysterious and extremely powerful.",
            rating = 5.0,
            power = 9900,
            month = "March",
            day = "9",
            family = listOf("Rockstar (crew)", "Uta (daughter in film)"),
            abilities = listOf("Conqueror's Haki", "Swordsmanship", "Presence Manipulation"),
            natureTypes = listOf("Fire", "Leadership", "Ambition")
        ),
        Character(
            id = 12,
            name = "Trafalgar D. Water Law",
            image = "/images/law.jpg",
            about = "Captain of the Heart Pirates and a skilled surgeon who wields the power of the Ope Ope no Mi, allowing him to manipulate anything within his 'Room'.",
            rating = 4.8,
            power = 9300,
            month = "October",
            day = "6",
            family = listOf("Donquixote Rosinante (mentor)"),
            abilities = listOf("Room", "Shambles", "Gamma Knife", "K-Room"),
            natureTypes = listOf("Surgical", "Dark", "Strategy")
        )
    )

    override val page5: List<Character> = listOf(
        Character(
            id = 13,
            name = "Marco the Phoenix",
            image = "/images/marco.jpg",
            about = "First division commander of the Whitebeard Pirates and a powerful Mythical Zoan user. Marco can transform into a phoenix and regenerate from injuries with blue flames.",
            rating = 4.8,
            power = 9400,
            month = "October",
            day = "5",
            family = listOf("Whitebeard Pirates"),
            abilities = listOf("Tori Tori no Mi, Model: Phoenix", "Blue Flame Regeneration", "Flight", "Healing"),
            natureTypes = listOf("Fire", "Air", "Resilience")
        ),
        Character(
            id = 14,
            name = "Boa Hancock",
            image = "/images/hancock.jpg",
            about = "The Empress of Amazon Lily and former Warlord of the Sea. Known for her beauty and her Devil Fruit that turns people to stone when they fall for her.",
            rating = 4.7,
            power = 8900,
            month = "September",
            day = "2",
            family = listOf("Boa Sandersonia", "Boa Marigold"),
            abilities = listOf("Mero Mero no Mi", "Slave Arrow", "Combat Mastery", "Haki"),
            natureTypes = listOf("Stone", "Charm", "Pride")
        ),
        Character(
            id = 15,
            name = "Sabo",
            image = "/images/sabo.jpg",
            about = "Chief of Staff of the Revolutionary Army and sworn brother of Luffy and Ace. After inheriting the Mera Mera no Mi, Sabo gained powerful fire-based abilities.",
            rating = 4.9,
            power = 9500,
            month = "March",
            day = "20",
            family = listOf("Monkey D. Luffy", "Portgas D. Ace", "Dragon (commander)"),
            abilities = listOf("Mera Mera no Mi", "Dragon Claw Fist", "Armament Haki", "Fire Fist"),
            natureTypes = listOf("Fire", "Justice", "Rebellion")
        )
    )

    override suspend fun getAllCharacters(page: Int): BasePageResponse<List<Character>> {
        return BasePageResponse<List<Character>>(
            data = heroes[page]!!,
            success = true,
            message = "Ok",
            httpStatus = HttpStatusCode.OK.value,
            meta = PagingMeta(
                currentPage = page,
                lastPage = heroes.keys.max(),
                total = heroes[page]!!.size
            )
        )
    }

    override suspend fun searchCharacter(name: String): BasePageResponse<List<Character>> {
        TODO("Not yet implemented")
    }

}