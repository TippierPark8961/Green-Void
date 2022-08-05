package test.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.meta.*;
import mindustry.world.draw.*;

public class AbyssBlocks implements ContentList {
	public static Block 
		kaleniumRouter;

@Override
public void load() {
kaleniumRouter = new Router("kalenium-router") {{
			requirements(Category.distribution, with(
				AbyssItems.kalenium, 1,
				Items.silicon, 2
			));
			speed = 0.1f;
			health = 154;
		}};}