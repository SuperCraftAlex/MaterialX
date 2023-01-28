package net.supercraftalex.materialx;

import java.util.ArrayList;
import java.util.List;

public class Materials {

    private static List<Material> materials = new ArrayList<>();

    public Materials() {
        materials.add(new Material("ai_2014", matcat.ALU_ALLOY, 57_000f, 0.101f));
        materials.add(new Material("ai_2024", matcat.ALU_ALLOY, 40_000f, 0.101f));
        materials.add(new Material("ai_7075", matcat.ALU_ALLOY, 63_000f, 0.101f));
        materials.add(new Material("ai_5052", matcat.ALU_ALLOY, 23_000f, 0.097f));
        materials.add(new Material("ai_5083", matcat.ALU_ALLOY, 31_000f, 0.097f));
        materials.add(new Material("ai_6061", matcat.ALU_ALLOY, 16_000f, 0.097f));

        materials.add(new Material("ASTM_A105", matcat.CARB_ALLOY_STEEL, 36_000f, 0.283f));
        materials.add(new Material("ASTM_A302", matcat.CARB_ALLOY_STEEL, 45_000f, 0.282f));
        materials.add(new Material("ASTM_A514", matcat.CARB_ALLOY_STEEL, 100_000f, 0.283f));
        materials.add(new Material("AISI_4130", matcat.CARB_ALLOY_STEEL, 70_000f, 0.283f));
        materials.add(new Material("API-5CT_J55", matcat.CARB_ALLOY_STEEL, 55_000f, 0.283f));
        materials.add(new Material("API-5CT_Q125", matcat.CARB_ALLOY_STEEL, 125_000f, 0.283f));
        materials.add(new Material("SAE_J429", matcat.CARB_ALLOY_STEEL, 57_000f, 0.283f));
        materials.add(new Material("S185", matcat.CARB_ALLOY_STEEL, 26_832f, 0.283f));
        materials.add(new Material("S235", matcat.CARB_ALLOY_STEEL, 34_084f, 0.283f));
        materials.add(new Material("S275", matcat.CARB_ALLOY_STEEL, 38_400f, 0.283f));
        materials.add(new Material("E295", matcat.CARB_ALLOY_STEEL, 42_700f, 0.283f));

        // TODO: ADD LATER
        //materials.add(new Material("ai_6063", matcat.ALU_ALLOY, 25_000f, 0.098f));
        //materials.add(new Material("ai_5086", matcat.ALU_ALLOY, 28_000f, 0.096f));
        //materials.add(new Material("ai_5456", matcat.ALU_ALLOY, 33_000f, 0.096f));
    }

    public static List<Material> getMaterials() {
        return materials;
    }

    enum matcat {
        ALU_ALLOY, // Aluminum Alloy
        CARB_ALLOY_STEEL, //Carbon / Alloy steel
        STAINLESS_STEEL, //Stainless steel
        DUC_CAST_IRON, //Ductile cast iron
        NICKEL_ALLOY, //Nickel alloy
        TITANIUM_ALLOY, //Titanium alloy
        COPPER_ALLOY, //Copper alloy

    }

    public class Material {

        public String name;
        public matcat category;
        public float strength; //yield strength in psi
        public float density; //density in lbm/in^3

        public float density_kgm3; //density in kg/m^3

        public Material(String name, matcat category, float strength, float density) {
            this.name = name.toLowerCase();
            this.category = category;
            this.strength = strength;
            this.density = density;

            this.density_kgm3 = density * 27_700f;
        }

    }

}
