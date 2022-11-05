package galena.oreganized.data;

import galena.oreganized.Oreganized;
import galena.oreganized.data.provider.OLangProvider;
import galena.oreganized.index.OBlocks;
import galena.oreganized.index.OEffects;
import galena.oreganized.index.OItems;
import galena.oreganized.index.OPotions;
import net.minecraft.data.DataGenerator;

public class OLang extends OLangProvider {

    public OLang(DataGenerator gen) {
        super(gen, Oreganized.MOD_ID, "en_us");
    }
    @Override
    protected void addTranslations() {
        addDisc(OItems.MUSIC_DISC_PILLAGED, "JamiesName", "Pillaged");
        addDisc(OItems.MUSIC_DISC_18, "JamiesName", "18");
        addDisc(OItems.MUSIC_DISC_SHULK, "JamiesName", "Shulk");

        addBlock(OBlocks.RAW_SILVER_BLOCK, "Block of Raw Silver");
        addBlock(OBlocks.RAW_LEAD_BLOCK, "Block of Raw Lead");
        addBlock(OBlocks.SILVER_BLOCK, "Block of Silver");
        addBlock(OBlocks.LEAD_BLOCK, "Block of Lead");
        addBlock(OBlocks.ELECTRUM_BLOCK, "Block of Electrum");

        addEffect(OEffects.STUNNING, "Stunning");
        addPotion(OPotions.STUNNING, "Stunning");

        addAdvTitle("adventure.mirror_mirror", "Mirror, Mirror who is the fairest?");
        addAdvDesc("adventure.mirror_mirror", "Obtain a Silver Mirror");
        addAdvTitle("story.melting_point", "Melting Point");
        addAdvDesc("story.melting_point", "Pick up Molten Lead from a cauldron");
        addAdvTitle("story.obtain_silver", "Every Stone has a Silver Lining");
        addAdvDesc("story.obtain_silver", "Smelt Raw Silver");
        addAdvTitle("story.electrum_gear", "Cover me in... Wings?");
        addAdvDesc("story.electrum_gear", "Obtain a full set of electrum armor");
        addAdvTitle("story.eat_with_lead", "Like the Romans");
        addAdvDesc("story.eat_with_lead", "Eat anything with lead in your hotbar");

        // JEED compat
        add("effect.oreganized.stunning.description", "Paralyzes the victim periodically with random intervals");

        addSubtitle("entity", "shrapnel_bomb.primed", "Shrapnel Bomb fizzes");

        /*
            Automatically create translations for blocks and items based on their registry name.

            This must be at the very bottom to avoid overwriting errors. These functions ignore objects
            that have already been translated above.
         */
        for (int i = 0; OBlocks.BLOCKS.getEntries().size() > i; i++) {
            tryBlock(OBlocks.BLOCKS.getEntries().stream().toList().get(i));
        }
        for (int i = 0; OItems.ITEMS.getEntries().size() > i; i++) {
            tryItem(OItems.ITEMS.getEntries().stream().toList().get(i));
        }
    }
}