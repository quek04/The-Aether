package com.gildedgames.aether.core.data;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.client.registry.AetherSoundEvents;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class AetherSoundData extends SoundDefinitionsProvider
{
    public AetherSoundData(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Aether.MODID, helper);
    }

    @Override
    public void registerSounds() {
        //Blocks
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_AMBIENT,
                definition().with(sound("minecraft:portal/portal").attenuationDistance(10))
                .subtitle("subtitles.block.aether_portal.ambient")
        );
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_TRAVEL,
                definition().with(sound("minecraft:portal/travel"))
        );
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_TRIGGER,
                definition().with(sound("minecraft:portal/trigger"))
                .subtitle("subtitles.block.aether_portal.trigger")
        );
        this.add(AetherSoundEvents.BLOCK_DUNGEON_TRAP_TRIGGER,
                definition().with(
                        sound("aether:block/dungeon_trap/trigger1"),
                        sound("aether:block/dungeon_trap/trigger2"),
                        sound("aether:block/dungeon_trap/trigger3"),
                        sound("aether:block/dungeon_trap/trigger4"),
                        sound("aether:block/dungeon_trap/trigger5"),
                        sound("aether:block/dungeon_trap/trigger6")
                ).subtitle("subtitles.block.dungeon_trap.trigger")
        );


        //Items
        this.add(AetherSoundEvents.ITEM_DART_SHOOTER_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                .subtitle("subtitles.item.dart_shooter.shoot")
        );
        this.add(AetherSoundEvents.ITEM_LIGHTNING_KNIFE_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                .subtitle("subtitles.item.lightning_knife.shoot")
        );
        this.add(AetherSoundEvents.ITEM_HAMMER_OF_NOTCH_SHOOT,
                definition().with(sound("minecraft:mob/ghast/fireball4"))
                .subtitle("subtitles.item.hammer_of_notch.shoot")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_ZANITE,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.item.armor.equip_zanite")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_GRAVITITE,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_gravitite")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_VALKYRIE,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_valkyrie")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_NEPTUNE,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_neptune")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_PHOENIX,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_phoenix")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_OBSIDIAN,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_obsidian")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_SENTRY,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.item.armor.equip_sentry")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GENERIC,
                definition().with(
                        sound("minecraft:item/armor/equip_generic1"),
                        sound("minecraft:item/armor/equip_generic2"),
                        sound("minecraft:item/armor/equip_generic3"),
                        sound("minecraft:item/armor/equip_generic4"),
                        sound("minecraft:item/armor/equip_generic5"),
                        sound("minecraft:item/armor/equip_generic6")
                ).subtitle("subtitles.item.accessory.equip_generic")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.item.accessory.equip_iron_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GOLD_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_gold1"),
                        sound("minecraft:item/armor/equip_gold2"),
                        sound("minecraft:item/armor/equip_gold3"),
                        sound("minecraft:item/armor/equip_gold4"),
                        sound("minecraft:item/armor/equip_gold5"),
                        sound("minecraft:item/armor/equip_gold6")
                ).subtitle("subtitles.item.accessory.equip_gold_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.item.accessory.equip_zanite_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ICE_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_generic1"),
                        sound("minecraft:item/armor/equip_generic2"),
                        sound("minecraft:item/armor/equip_generic3"),
                        sound("minecraft:item/armor/equip_generic4"),
                        sound("minecraft:item/armor/equip_generic5"),
                        sound("minecraft:item/armor/equip_generic6")
                ).subtitle("subtitles.item.accessory.equip_ice_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.item.accessory.equip_iron_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GOLD_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_gold1"),
                        sound("minecraft:item/armor/equip_gold2"),
                        sound("minecraft:item/armor/equip_gold3"),
                        sound("minecraft:item/armor/equip_gold4"),
                        sound("minecraft:item/armor/equip_gold5"),
                        sound("minecraft:item/armor/equip_gold6")
                ).subtitle("subtitles.item.accessory.equip_gold_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.item.accessory.equip_zanite_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ICE_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_generic1"),
                        sound("minecraft:item/armor/equip_generic2"),
                        sound("minecraft:item/armor/equip_generic3"),
                        sound("minecraft:item/armor/equip_generic4"),
                        sound("minecraft:item/armor/equip_generic5"),
                        sound("minecraft:item/armor/equip_generic6")
                ).subtitle("subtitles.item.accessory.equip_ice_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_CAPE,
                definition().with(
                        sound("minecraft:item/armor/equip_leather1"),
                        sound("minecraft:item/armor/equip_leather2"),
                        sound("minecraft:item/armor/equip_leather3"),
                        sound("minecraft:item/armor/equip_leather4"),
                        sound("minecraft:item/armor/equip_leather5"),
                        sound("minecraft:item/armor/equip_leather6")
                ).subtitle("subtitles.item.accessory.equip_cape")
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_AETHER_TUNE,
                definition().with(sound("aether:item/records/aether_tune").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_ASCENDING_DAWN,
                definition().with(sound("aether:item/records/ascending_dawn").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_WELCOMING_SKIES,
                definition().with(sound("aether:item/records/welcoming_skies").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_LEGACY,
                definition().with(sound("aether:item/records/legacy").stream())
        );


        //Entities
        this.add(AetherSoundEvents.ENTITY_PHYG_AMBIENT,
                definition().with(
                        sound("minecraft:mob/pig/say1"),
                        sound("minecraft:mob/pig/say2"),
                        sound("minecraft:mob/pig/say3")
                ).subtitle("subtitles.entity.phyg.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_DEATH,
                definition().with(sound("minecraft:mob/pig/death"))
                .subtitle("subtitles.entity.phyg.death")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_HURT,
                definition().with(
                        sound("minecraft:mob/pig/say1"),
                        sound("minecraft:mob/pig/say2"),
                        sound("minecraft:mob/pig/say3")
                ).subtitle("subtitles.entity.phyg.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_SADDLE,
                definition().with(sound("minecraft:mob/horse/leather"))
                .subtitle("subtitles.entity.phyg.saddle")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_STEP,
                definition().with(
                        sound("minecraft:mob/pig/step1"),
                        sound("minecraft:mob/pig/step2"),
                        sound("minecraft:mob/pig/step3"),
                        sound("minecraft:mob/pig/step4"),
                        sound("minecraft:mob/pig/step5")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_AMBIENT,
                definition().with(
                        sound("minecraft:mob/cow/say1"),
                        sound("minecraft:mob/cow/say2"),
                        sound("minecraft:mob/cow/say3"),
                        sound("minecraft:mob/cow/say4")
                ).subtitle("subtitles.entity.flying_cow.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_DEATH,
                definition().with(
                        sound("minecraft:mob/cow/hurt1"),
                        sound("minecraft:mob/cow/hurt2"),
                        sound("minecraft:mob/cow/hurt3")
                ).subtitle("subtitles.entity.flying_cow.death")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_HURT,
                definition().with(
                        sound("minecraft:mob/cow/hurt1"),
                        sound("minecraft:mob/cow/hurt2"),
                        sound("minecraft:mob/cow/hurt3")
                ).subtitle("subtitles.entity.flying_cow.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_SADDLE,
                definition().with(sound("minecraft:mob/horse/leather"))
                        .subtitle("subtitles.entity.flying_cow.saddle")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_MILK,
                definition().with(
                        sound("minecraft:entity/cow/milk1"),
                        sound("minecraft:entity/cow/milk2"),
                        sound("minecraft:entity/cow/milk3")
                ).subtitle("subtitles.entity.flying_cow.milk")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_STEP,
                definition().with(
                        sound("minecraft:mob/cow/step1"),
                        sound("minecraft:mob/cow/step2"),
                        sound("minecraft:mob/cow/step3"),
                        sound("minecraft:mob/cow/step4")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_AMBIENT,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.entity.sheepuff.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_DEATH,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.entity.sheepuff.death")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_HURT,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.entity.sheepuff.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_SHEAR,
                definition().with(sound("minecraft:mob/sheep/shear"))
                .subtitle("subtitles.item.shears.shear")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_STEP,
                definition().with(
                        sound("minecraft:mob/sheep/step1"),
                        sound("minecraft:mob/sheep/step2"),
                        sound("minecraft:mob/sheep/step3"),
                        sound("minecraft:mob/sheep/step4"),
                        sound("minecraft:mob/sheep/step5")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_AMBIENT,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.moa.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_DEATH,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.moa.death")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_HURT,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.moa.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_FLAP,
                definition().with(sound("minecraft:mob/bat/takeoff"))
                        .subtitle("subtitles.entity.moa.flap")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_EGG,
                definition().with(sound("minecraft:mob/chicken/plop"))
                .subtitle("subtitles.entity.moa.egg")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_AMBIENT,
                definition().with(sound("aether:entity/aerwhale/call"))
                .subtitle("subtitles.entity.aerwhale.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_DEATH,
                definition().with(sound("aether:entity/aerwhale/death"))
                .subtitle("subtitles.entity.aerwhale.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_HURT,
                definition().with(sound("aether:entity/aerwhale/death"))
                .subtitle("subtitles.entity.aerwhale.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_DEATH,
                definition().with(sound("aether:entity/aerbunny/death"))
                .subtitle("subtitles.entity.aerbunny.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_HURT,
                definition().with(sound("aether:entity/aerbunny/hurt"))
                        .subtitle("subtitles.entity.aerbunny.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_LIFT,
                definition().with(sound("aether:entity/aerbunny/lift"))
                        .subtitle("subtitles.entity.aerbunny.lift")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_ATTACK,
                definition().with(
                        sound("minecraft:mob/slime/attack1"),
                        sound("minecraft:mob/slime/attack2")
                ).subtitle("subtitles.entity.swet.attack")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_DEATH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.swet.death")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_HURT,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.swet.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_JUMP,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.swet.squish")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_SQUISH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.swet.squish")
        );
        this.add(AetherSoundEvents.ENTITY_AECHOR_PLANT_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                .subtitle("subtitles.entity.aechor_plant.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                .subtitle("subtitles.entity.cockatrice.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_AMBIENT,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.cockatrice.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_DEATH,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.cockatrice.death")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_HURT,
                definition().with(sound("aether:entity/moa/say"))
                .subtitle("subtitles.entity.cockatrice.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_FLAP,
                definition().with(sound("minecraft:mob/bat/takeoff"))
                .subtitle("subtitles.entity.cockatrice.flap")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_SHOOT,
                definition().with(sound("aether:entity/zephyr/shoot"))
                .subtitle("subtitles.entity.zephyr.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_AMBIENT,
                definition().with(sound("aether:entity/zephyr/call"))
                .subtitle("subtitles.entity.zephyr.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_DEATH,
                definition().with(sound("aether:entity/zephyr/call"))
                .subtitle("subtitles.entity.zephyr.death")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_HURT,
                definition().with(sound("aether:entity/zephyr/call"))
                .subtitle("subtitles.entity.zephyr.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_DEATH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.sentry.death")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_HURT,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.sentry.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_JUMP,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.entity.sentry.jump")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_DEATH,
                definition().with(
                        sound("minecraft:block/chest/close"),
                        sound("minecraft:block/chest/close2"),
                        sound("minecraft:block/chest/close3")
                ).subtitle("subtitles.entity.mimic.death")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_HURT,
                definition().with(
                        sound("minecraft:dig/wood1"),
                        sound("minecraft:dig/wood2"),
                        sound("minecraft:dig/wood3"),
                        sound("minecraft:dig/wood4")
                ).subtitle("subtitles.entity.mimic.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_AWAKEN,
                definition().with(sound("aether:entity/slider/awaken"))
                .subtitle("subtitles.entity.slider.awaken")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_COLLIDE,
                definition().with(sound("aether:entity/slider/collide"))
                .subtitle("subtitles.entity.slider.collide")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_MOVE,
                definition().with(sound("aether:entity/slider/move"))
                        .subtitle("subtitles.entity.slider.move")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_DEATH,
                definition().with(sound("aether:entity/slider/death"))
                .subtitle("subtitles.entity.slider.death")
        );
        this.add(AetherSoundEvents.ENTITY_SUN_SPIRIT_SHOOT,
                definition().with(sound("minecraft:mob/ghast/fireball4"))
                .subtitle("subtitles.entity.sun_spirit.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_CLOUD_MINION_SHOOT,
                definition().with(sound("aether:entity/zephyr/shoot"))
                .subtitle("subtitles.entity.cloud_minion.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_CLOUD_CRYSTAL_EXPLODE,
                definition().with(
                        sound("minecraft:random/glass1"),
                        sound("minecraft:random/glass2"),
                        sound("minecraft:random/glass3")
                ).subtitle("subtitles.entity.cloud_crystal.explode")
        );
        this.add(AetherSoundEvents.ENTITY_DART_HIT,
                definition().with(sound("aether:entity/projectile/shoot"))
                .subtitle("subtitles.entity.dart.hit")
        );


        //UI
        this.add(AetherSoundEvents.UI_TOAST_AETHER_GENERAL,
                definition().with(sound("aether:achievement/achievement_gen").stream())
        );
        this.add(AetherSoundEvents.UI_TOAST_AETHER_BRONZE,
                definition().with(sound("aether:achievement/achievement_bronze").stream())
        );
        this.add(AetherSoundEvents.UI_TOAST_AETHER_SILVER,
                definition().with(sound("aether:achievement/achievement_silver").stream())
        );


        //Music
        this.add(AetherSoundEvents.MUSIC_MENU,
                definition().with(sound("aether:music/menu").stream())
        );
        this.add(AetherSoundEvents.MUSIC_AETHER,
                definition().with(
                        sound("aether:music/aether1").stream(),
                        sound("aether:music/aether2").stream(),
                        sound("aether:music/aether3").stream(),
                        sound("aether:music/aether4").stream(),
                        sound("aether:music/aether5").stream()
                )
        );
    }
}
