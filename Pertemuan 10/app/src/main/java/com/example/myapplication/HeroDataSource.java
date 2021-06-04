package com.example.myapplication;

import java.util.ArrayList;

public class HeroDataSource {
        private static String[] heroNames = {
                "Amber",
                "Barley",
                "Bea",
                "Belle",
                "Bibi",
                "8Bit",
                "Bo",
                "Brock",
                "Bull",
                "Byron"
        };

        private static String[] heroDetails = {
                "Amber is a Legendary Brawler that attacks by firing a continuous stream of fire that can pierce through enemies. She has a long range with a reliably high damage output. For her Super, Amber lobs a flask full of fire fluid, which can be ignited and cause nearby enemies to be set on fire. Her Gadget, Fire Starters, increases her movement speed and leaves behind a trail of fire fluid for 3 seconds. Her first Star Power, Wild Flames, allows her to have two fire puddles simultaneously, as well as passively charges her Super when standing on them. Her second Star Power, Scorchin' Siphon, allows her to reload faster while she is near a fire puddle.",
                "Barley is a Rare Brawler who attacks by throwing a bottle of harmful liquid that covers a small area on the ground, dealing damage to enemies in that area over time. His Super fires five similar bottles which cover a greater area and persist for a longer time. He has rather low health but has a lot of damage potential. His first Gadget, Sticky Syrup Mixer, creates a sticky puddle around himself, slowing enemies down. His second Gadget, Herbal Tonic, throws bottles around himself and teammates that heal them if they stand on the puddles. His first Star Power, Medical Use, heals him slightly when he throws his bottle, but not with his Super. His second Star Power, Extra Noxious, adds additional damage per second to his main attack. Barley and his Wizard skin can be unlocked for free by linking an account to Supercell ID.",
                "Bea is an Epic Brawler with low health but relatively high damage output. Landing her attack supercharges her next attack, allowing it to deal 175% more damage. Her reload speed is quick, but she only has 1 ammo slot. Her Super shoots 7 drones that damage enemies and slow them down. Her first Gadget, Honey Molasses, deploys a hive that creates sticky honey around itself, slowing down enemies who step inside. Her second Gadget, Rattled Hive, sends 4 bees that damage enemies depending on their travel distance. Her first Star Power, Insta Beaload, supercharges her main attack again if she misses a supercharged shot. Her second Star Power, Honeycomb, gives her a shield whenever she has a supercharged shot.",
                "Belle is a Chromatic Brawler who can be unlocked as a Brawl Pass reward at Tier 30 in Season 6: The Goldarm Gang, or can be obtained from boxes after reaching Tier 30 in the Season 6 Brawl Pass. She has low health and her attacks deal moderate damage and reloads fast. Her attacks are long-ranged electric shock bolts that bounce between enemies nearby. Her Super fires a tracer onto an enemy, dealing low damage but boosting all incoming damage towards that enemy until they are defeated. Her Gadget, Nest Egg, drops an invisible trap that deal low damage and briefly slows enemies upon triggering them. Her Star Power, Positive Feedback, grants her a very brief shield whenever she hits an enemy with her attack.",
                "Bibi is an Epic Brawler who attacks with a baseball bat, hitting enemies in a close range arc. She charges her Home Run bar if all 3 ammo bars are reloaded. Charging the Home Run bar will allow her next attack to knock back enemies. She has moderate-high health and a short attack range, but her attack is very wide and can deal a lot of damage. Bibi's Super sends out a long-ranged damaging bubble that can pierce through enemies and bounce off of walls. Her Gadget, Vitamin Booster, allows her to heal for a total of 2400 health over 4 seconds. Her first Star Power, Home Run, increases her movement speed when her Home Run bar is charged and her second Star Power, Batting Stance, gives her a shield when she has her Home Run bar filled up.",
                "8-BIT is a Common Brawler who is unlocked as a Trophy Road reward upon reaching 6000 Trophies. He has both high health and damage output, but suffers from a significantly slower movement speed compared to other Brawlers. He wields a laser gun that he uses to fire high-damage beams at enemies at long range with a slight spread. His Super spawns a Damage Booster, granting him and his allies within its radius a damage boost. His first Gadget, Cheat Cartridge, makes him instantly teleport to his Damage Booster. His second Gadget, Extra Credits, triples the amount of projectiles for his next main attack. His first Star Power, Boosted Booster, significantly increases his Damage Booster radius. His second Star Power, Plugged In, increases his movement speed while near his Damage Booster.",
                "Bo is a Common Brawler unlocked as a Trophy Road reward upon reaching 3000 Trophies. He has moderate health, moderately high damage, and great utility. He attacks by firing exploding arrows that deal moderate damage at long range. His Super places invisible traps in an area that explode when an enemy steps on them. His first Gadget, Super Totem, places a totem that slowly charges the Supers of nearby allies. His second Gadget, Tripwire, enables him to detonate his mines manually without having an enemy trigger them. His first Star Power, Circling Eagle, increases his field of view into bushes. His second Star Power, Snare a Bear, causes his mines to momentarily stun enemies instead of a knockback.",
                "Brock is a Common Brawler who is unlocked as a Trophy Road reward upon reaching 1000 Trophies. He has a low amount of health but shoots rockets at a very long-range that explode, dealing moderately high damage in a short radius. His Super fires a barrage of rockets in a large area. His first Gadget, Rocket Laces, allows him to fire at his feet, damaging nearby enemies and launching Brock into the air. His second Gadget, Rocket Fuel, makes Brock's next attack a more devastating mega rocket. His first Star Power, Incendiary, allows his rockets to leave a patch of fire which deal damage over time in the area of effect. His second Star Power, Rocket No. Four, increases Brock's ammo capacity to 4.",
                "Bull is a Common Brawler who is unlocked as a Trophy Road reward upon reaching 250 Trophies. Like Shelly, he wields a shotgun. Bull has a high amount of health and excels at short-range combat. These attributes make him great at ambushing and overwhelming enemy Brawlers. His Super allows him to charge forward, damaging enemies and destroying obstacles in his way. His first Gadget, T-Bone Injector, instantly heals him for a considerable amount. His second Gadget, Stomper, halts his Super and stomps on the ground, slowing enemies within range. His first Star Power, Berserker, doubles his reload speed when he is at below 60% health. His second Star Power, Tough Guy, grants him a shield when he falls below 40% health.",
                "Byron is a Mythic Brawler that has low burst-damage potential and health, but can provide a large amount of healing utility to his team. His attack fires a single long-range dart, dealing moderate amount of damage over time if it hits an enemy, but applies healing over time if it hits an ally. His Super tosses a vial of liquid that splashes on the ground, dealing damage to all enemies and healing all teammates in its splash radius upon impact. His Gadget, Shot in the Arm, consumes one bar of ammo while healing him for a short amount of time. His first Star Power, Malaise, momentarily halves all possible healing effects for enemies if they are hit by his Super. His second Star Power, Injection, allows Byron's attack to pierce through allies and enemies alike every 3.5 seconds."
        };

        private static int[] heroesImages = {
                R.drawable.amber,
                R.drawable.barley,
                R.drawable.bea,
                R.drawable.belle,
                R.drawable.bibi,
                R.drawable.bit,
                R.drawable.bo,
                R.drawable.brock,
                R.drawable.bull,
                R.drawable.byron
        };

        static ArrayList<Hero> getListData() {
            ArrayList<Hero> list = new ArrayList<>();
            for (int position = 0; position < heroNames.length; position++) {
                Hero hero = new Hero();
                hero.setName(heroNames[position]);
                hero.setDetail(heroDetails[position]);
                hero.setPhoto(heroesImages[position]);
                list.add(hero);
            }
            return list;
        }
}
