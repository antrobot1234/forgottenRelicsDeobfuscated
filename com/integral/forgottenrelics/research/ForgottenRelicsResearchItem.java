/*    */ package com.integral.forgottenrelics.research;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.util.StatCollector;
/*    */ import thaumcraft.api.aspects.AspectList;
/*    */ import thaumcraft.api.research.ResearchItem;
/*    */ import thaumcraft.api.research.ResearchPage;
/*    */ 
/*    */ public class ForgottenRelicsResearchItem
/*    */   extends ResearchItem
/*    */ {
/*    */   public ForgottenRelicsResearchItem(String key, String category) {
/* 16 */     super(key, category);
/*    */   }
/*    */ 
/*    */   
/*    */   public ForgottenRelicsResearchItem(String key, String category, AspectList tags, int col, int row, int complex, ItemStack icon) {
/* 21 */     super(key, category, tags, col, row, complex, icon);
/*    */   }
/*    */ 
/*    */   
/*    */   public ForgottenRelicsResearchItem(String key, String category, AspectList tags, int col, int row, int complex, ResourceLocation icon) {
/* 26 */     super(key, category, tags, col, row, complex, icon);
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public String getName() {
/* 32 */     return StatCollector.translateToLocal("fr.name." + this.key);
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public String getText() {
/* 38 */     return StatCollector.translateToLocal("fr.tag." + this.key);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ResearchItem setPages(ResearchPage... par) {
/* 44 */     for (ResearchPage page : par) {
/*    */       
/* 46 */       if (page.type == ResearchPage.PageType.TEXT)
/*    */       {
/* 48 */         page.text = "fr.text." + this.key + "." + page.text;
/*    */       }
/* 50 */       if (page.type == ResearchPage.PageType.INFUSION_CRAFTING)
/* 51 */         if (this.parentsHidden == null || this.parentsHidden.length == 0) {
/*    */           
/* 53 */           this.parentsHidden = new String[] { "INFUSION" };
/*    */         }
/*    */         else {
/*    */           
/* 57 */           String[] newParents = new String[this.parentsHidden.length + 1];
/* 58 */           newParents[0] = "INFUSION";
/* 59 */           for (int i = 0; i < this.parentsHidden.length; i++)
/* 60 */             newParents[i + 1] = this.parentsHidden[i]; 
/* 61 */           this.parentsHidden = newParents;
/*    */         }  
/*    */     } 
/* 64 */     return super.setPages(par);
/*    */   }
/*    */ }


/* Location:              C:\Users\antro\Documents\forgottenRelicsDeobfuscated.jar!\com\integral\forgottenrelics\research\ForgottenRelicsResearchItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */