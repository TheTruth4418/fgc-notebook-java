package com.example.FGCNotebook;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String[] MK1 = {"Ashrah", "Baraka", "Geras", "General Shao", "Havik", "Johnny Cage", "Kenshi", "Kitana", "Kung Lao", "Liu Kang", "Li-mei", "Mileena", "Nitara", "Omni-Man", "Peacemaker", "Quan Chi", "Raiden", "Rain", "Reiko", "Reptile", "Scorpion", "Shang Tsung", "Sindel", "Smoke", "Sub-zero", "Tanya"};
    public static final String[] SF6 = {"A.K.I", "Blanka", "Cammy", "Chun Li", "Dee Jay", "Dhalsim", "E. Honda", "Guile", "Jaime", "JP", "Juri", "Ken", "Kimberly", "Lily", "Luke", "Manon", "Marisa", "Rashid", "Ryu", "Zangief"};
    public static final String[] Tekken8 = {"Alisa", "Asuka", "Azucena", "Bryan", "Claudio", "Devil Jin", "Dragonuv", "Feng", "Hworang", "Jack-8", "Jin", "Jun", "Kazuya", "King", "Kuma", "Law", "Lars", "Lee", "Leo", "Leroy", "Lili", "Nina", "Panda", "Paul", "Raven", "Reina", "Shaheen", "Steve", "Victor", "Xiaoyu", "Yoshimitsu", "Zafina"};

    public static final Map<String, String[]> getGameData(){
        Map<String, String[]> charMap = new HashMap<>();

        charMap.put("Mortal_Kombat_1", Constants.MK1);
        charMap.put("Street_Fighter_6", Constants.SF6);
        charMap.put("Tekken_8", Constants.Tekken8);

        return charMap;
    }
}
