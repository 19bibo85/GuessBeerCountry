package com.GuessBeerCountry.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Alberto Tosi Brandi on 07/03/2015.
 */
public class InitialData {
    private static final String TAG = "InitialData";
    private static ContentValues values = new ContentValues();

    // Insert default data for Build
    public static void InsertBuild(SQLiteDatabase db) {
        values.clear();

        values.put(Database.BUILD[1], 1);
        values.put(Database.BUILD[2], "Guess License Plate");
        values.put(Database.BUILD[3], 1);
        values.put(Database.BUILD[4], "Alberto Tosi Brandi");
        db.insert(Database.TABLES[0], null, values);
        Log.i(TAG, "Inserting BUILD table.");
    }

    // Insert default data for Name
    public static void InsertName(SQLiteDatabase db) {
        values.clear();

        // 1396
        values.put(Database.NAME[1], "1396_001");
        values.put(Database.NAME[2], "1396");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting 1396.");

        // A.Le Coq
        values.put(Database.NAME[1], "le_coq_001");
        values.put(Database.NAME[2], "A.Le Coq");
        values.put(Database.NAME[3], 233);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting A.Le Coq.");

        // A Marca Bavaria
        values.put(Database.NAME[1], "marca_bavaria_001");
        values.put(Database.NAME[2], "A Marca Bavaria");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting A Marca Bavaria.");

        // Aguila
        values.put(Database.NAME[1], "aguila_001");
        values.put(Database.NAME[2], "Aguila");
        values.put(Database.NAME[3], 170);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Aguila.");

        // Aguila Nueva
        values.put(Database.NAME[1], "aguila_002");
        values.put(Database.NAME[2], "Aguila Nueva");
        values.put(Database.NAME[3], 170);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Aguila Nueva.");

        // Alcatraz
        values.put(Database.NAME[1], "alcatraz_001");
        values.put(Database.NAME[2], "Alcatraz");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 7);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Alcatraz.");

        // Aldaris
        values.put(Database.NAME[1], "aldaris_001");
        values.put(Database.NAME[2], "Aldaris");
        values.put(Database.NAME[3], 428);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Aldaris.");

        // Aldeida de Mata
        values.put(Database.NAME[1], "aldeida_de_mata_001");
        values.put(Database.NAME[2], "Aldeida de Mata");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Aldeida de Mata.");

        // Alexander Keith's
        values.put(Database.NAME[1], "alexander_keith_001");
        values.put(Database.NAME[2], "Alexander Keith's");
        values.put(Database.NAME[3], 124);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Alexander Keith's.");

        // Alfa Beer
        values.put(Database.NAME[1], "alfa_beer_001");
        values.put(Database.NAME[2], "Alfa Beer");
        values.put(Database.NAME[3], 300);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Alfa Beer.");

        // Alhambra
        values.put(Database.NAME[1], "alhambra_001");
        values.put(Database.NAME[2], "Alhambra");
        values.put(Database.NAME[3], 620);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Alhambra.");

        // Alutus
        values.put(Database.NAME[1], "alutus_001");
        values.put(Database.NAME[2], "Alutus");
        values.put(Database.NAME[3], 642);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Alutus.");

        // Ambar
        values.put(Database.NAME[1], "ambar_001");
        values.put(Database.NAME[2], "Ambar");
        values.put(Database.NAME[3], 724);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Ambar.");

        // Amstel
        values.put(Database.NAME[1], "amstel_001");
        values.put(Database.NAME[2], "Amstel");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Amstel.");

        // Andes
        values.put(Database.NAME[1], "andes_001");
        values.put(Database.NAME[2], "Andes");
        values.put(Database.NAME[3], 218);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Andes.");

        // Antarctica
        values.put(Database.NAME[1], "antarctica_001");
        values.put(Database.NAME[2], "Antarctica");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Antarctica.");

        // Arequipena
        values.put(Database.NAME[1], "arequipena_001");
        values.put(Database.NAME[2], "Arequipena");
        values.put(Database.NAME[3], 604);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Arequipena.");

        // Ariana
        values.put(Database.NAME[1], "ariana_001");
        values.put(Database.NAME[2], "Ariana");
        values.put(Database.NAME[3], 100);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Ariana.");

        // Asahi
        values.put(Database.NAME[1], "asahi_001");
        values.put(Database.NAME[2], "Asahi");
        values.put(Database.NAME[3], 392);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Asahi.");

        // Astra
        values.put(Database.NAME[1], "astra_001");
        values.put(Database.NAME[2], "Astra");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Astra.");

        // Augustiner
        values.put(Database.NAME[1], "augustiner_001");
        values.put(Database.NAME[2], "Augustiner");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Augustiner.");

        // Balashi
        values.put(Database.NAME[1], "balashi_001");
        values.put(Database.NAME[2], "Balashi");
        values.put(Database.NAME[3], 533);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Balashi.");

        // Balboa
        values.put(Database.NAME[1], "balboa_001");
        values.put(Database.NAME[2], "Balboa");
        values.put(Database.NAME[3], 591);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Balboa.");

        // Barena
        values.put(Database.NAME[1], "barena_001");
        values.put(Database.NAME[2], "Barena");
        values.put(Database.NAME[3], 340);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Barena.");

        // Bavaria
        values.put(Database.NAME[1], "bavaria_001");
        values.put(Database.NAME[2], "Bavaria");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bavaria.");

        // Bavik
        values.put(Database.NAME[1], "bavik_001");
        values.put(Database.NAME[2], "Bavik");
        values.put(Database.NAME[3], 56);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bavik.");

        // Beamish
        values.put(Database.NAME[1], "beamish_001");
        values.put(Database.NAME[2], "Beamish");
        values.put(Database.NAME[3], 372);
        values.put(Database.NAME[4], 27);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Beamish.");

        // Beck's
        values.put(Database.NAME[1], "becks_001");
        values.put(Database.NAME[2], "Beck's");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Beck's.");

        // Beogradska
        values.put(Database.NAME[1], "beogradska_001");
        values.put(Database.NAME[2], "Beogradska");
        values.put(Database.NAME[3], 688);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Beogradska.");

        // Bergenbier
        values.put(Database.NAME[1], "bergenbier_001");
        values.put(Database.NAME[2], "Bergenbier");
        values.put(Database.NAME[3], 642);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bergenbier.");

        // Bischofshof
        values.put(Database.NAME[1], "bischofshof_001");
        values.put(Database.NAME[2], "Bischofshof");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 7);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bischofshof.");

        // Bochkarev
        values.put(Database.NAME[1], "bochkarev_001");
        values.put(Database.NAME[2], "Bochkarev");
        values.put(Database.NAME[3], 643);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bochkarev.");

        // Boddingtons
        values.put(Database.NAME[1], "boddingtons_001");
        values.put(Database.NAME[2], "Boddingtons");
        values.put(Database.NAME[3], 829);
        values.put(Database.NAME[4], 19);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Boddingtons.");

        // Bodegas Pomar
        values.put(Database.NAME[1], "bodegas_pomar_001");
        values.put(Database.NAME[2], "Bodegas Pomar");
        values.put(Database.NAME[3], 862);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bodegas Pomar.");

        // Brahma
        values.put(Database.NAME[1], "brahma_001");
        values.put(Database.NAME[2], "Brahma");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Brahma.");

        // Namyslow
        values.put(Database.NAME[1], "namyslow_001");
        values.put(Database.NAME[2], "Namyslow");
        values.put(Database.NAME[3], 616);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Namyslow.");

        // Bucanero
        values.put(Database.NAME[1], "bucanero_001");
        values.put(Database.NAME[2], "Bucanero");
        values.put(Database.NAME[3], 192);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bucanero.");

        // Budweiser
        values.put(Database.NAME[1], "budweiser _001");
        values.put(Database.NAME[2], "Budweiser");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Budweiser.");

        // Bud Light
        values.put(Database.NAME[1], "bud_light_001");
        values.put(Database.NAME[2], "Bud Light");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bud Light.");

        // Busch
        values.put(Database.NAME[1], "busch_001");
        values.put(Database.NAME[2], "Busch");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Busch.");

        // Cachoeirinha
        values.put(Database.NAME[1], "cachoeirinha_001");
        values.put(Database.NAME[2], "Cachoeirinha");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Cachoeirinha.");

        // Carling
        values.put(Database.NAME[1], "carling_001");
        values.put(Database.NAME[2], "Carling");
        values.put(Database.NAME[3], 826);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Carling.");

        // Carlsberg
        values.put(Database.NAME[1], "carlsberg_001");
        values.put(Database.NAME[2], "Carlsberg");
        values.put(Database.NAME[3], 208);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Carlsberg.");

        // Cass Beer
        values.put(Database.NAME[1], "cass_beer_001");
        values.put(Database.NAME[2], "Cass Beer");
        values.put(Database.NAME[3], 408);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Cass Beer.");

        // Castle Lager
        values.put(Database.NAME[1], "castle_lager_001");
        values.put(Database.NAME[2], "Castle Lager");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Castle Lager.");

        // Bossa Nova
        values.put(Database.NAME[1], "bossa_nova_001");
        values.put(Database.NAME[2], "Bossa Nova");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Bossa Nova.");

        // Colônia
        values.put(Database.NAME[1], "colonia_001");
        values.put(Database.NAME[2], "Colônia");
        values.put(Database.NAME[3], 27);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Colônia.");

        // Cristal
        values.put(Database.NAME[1], "cristal_001");
        values.put(Database.NAME[2], "Cristal");
        values.put(Database.NAME[3], 620);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Cristal.");

        // Liber
        values.put(Database.NAME[1], "liber_001");
        values.put(Database.NAME[2], "Liber");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Liber.");

        // Sol
        values.put(Database.NAME[1], "sol_001");
        values.put(Database.NAME[2], "Sol");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Sol.");

        // Atlas
        values.put(Database.NAME[1], "atlas_001");
        values.put(Database.NAME[2], "Atlas");
        values.put(Database.NAME[3], 591);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Atlas.");

        // Barrilito
        values.put(Database.NAME[1], "barrilito_001");
        values.put(Database.NAME[2], "Barrilito");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Barrilito.");

        // Estrella
        values.put(Database.NAME[1], "estrella_001");
        values.put(Database.NAME[2], "Estrella");
        values.put(Database.NAME[3], 724);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Estrella.");

        // Mexicali
        values.put(Database.NAME[1], "mexicali_001");
        values.put(Database.NAME[2], "Mexicali");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Mexicali.");

        // Modelo Light
        values.put(Database.NAME[1], "modelo_light_001");
        values.put(Database.NAME[2], "Modelo Light");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Modelo Light.");

        // Pacifico
        values.put(Database.NAME[1], "pacifico_001");
        values.put(Database.NAME[2], "Pacifico");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Pacifico.");

        // Soberana
        values.put(Database.NAME[1], "soberana_001");
        values.put(Database.NAME[2], "Soberana");
        values.put(Database.NAME[3], 591);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Soberana.");

        // Chang
        values.put(Database.NAME[1], "chang_001");
        values.put(Database.NAME[2], "Chang");
        values.put(Database.NAME[3], 764);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Chang.");

        // Chimay
        values.put(Database.NAME[1], "chimay_001");
        values.put(Database.NAME[2], "Chimay");
        values.put(Database.NAME[3], 56);
        values.put(Database.NAME[4], 20);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Chimay.");

        // Cintra
        values.put(Database.NAME[1], "cintra_001");
        values.put(Database.NAME[2], "Cintra");
        values.put(Database.NAME[3], 620);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Cintra.");

        // Clausthaler
        values.put(Database.NAME[1], "clausthaler_001");
        values.put(Database.NAME[2], "Clausthaler");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Clausthaler.");

        // Coors light
        values.put(Database.NAME[1], "coors_light_001");
        values.put(Database.NAME[2], "Coors light");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Coors light.");

        // Corona Extra
        values.put(Database.NAME[1], "corona_extra_001");
        values.put(Database.NAME[2], "Corona Extra");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Corona Extra.");

        // Cusqueña
        values.put(Database.NAME[1], "cusquena_001");
        values.put(Database.NAME[2], "Cusqueña");
        values.put(Database.NAME[3], 604);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Cusqueña.");

        // Devassa Cervejaria
        values.put(Database.NAME[1], "devassa_cervejaria_001");
        values.put(Database.NAME[2], "Devassa Cervejaria");
        values.put(Database.NAME[3], 604);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Devassa Cervejaria.");

        // Dommelsch
        values.put(Database.NAME[1], "dommelsch_001");
        values.put(Database.NAME[2], "Dommelsch");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Dommelsch.");

        // Dorada
        values.put(Database.NAME[1], "dorada_001");
        values.put(Database.NAME[2], "Dorada");
        values.put(Database.NAME[3], 724);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Dorada.");

        // Dreher
        values.put(Database.NAME[1], "dreher_001");
        values.put(Database.NAME[2], "Dreher");
        values.put(Database.NAME[3], 40);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Dreher.");

        // Erdinger
        values.put(Database.NAME[1], "erdinger_001");
        values.put(Database.NAME[2], "Erdinger");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 7);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Erdinger.");

        // FORST
        values.put(Database.NAME[1], "forst_001");
        values.put(Database.NAME[2], "FORST");
        values.put(Database.NAME[3], 380);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting FORST.");

        // Foster's
        values.put(Database.NAME[1], "fosters_001");
        values.put(Database.NAME[2], "Foster's");
        values.put(Database.NAME[3], 36);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Foster's.");

        // Gambrinus
        values.put(Database.NAME[1], "gambrinus_001");
        values.put(Database.NAME[2], "Gambrinus");
        values.put(Database.NAME[3], 203);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Gambrinus.");

        // Golden brau
        values.put(Database.NAME[1], "goldenbrau_001");
        values.put(Database.NAME[2], "Golden brau");
        values.put(Database.NAME[3], 203);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Golden brau.");

        // Gosser
        values.put(Database.NAME[1], "gosser_001");
        values.put(Database.NAME[2], "Gosser");
        values.put(Database.NAME[3], 40);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Gosser.");

        // Grolsch
        values.put(Database.NAME[1], "grolsch_001");
        values.put(Database.NAME[2], "Grolsch");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Grolsch.");

        // Guinness
        values.put(Database.NAME[1], "guinness_001");
        values.put(Database.NAME[2], "Guinness");
        values.put(Database.NAME[3], 327);
        values.put(Database.NAME[4], 27);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Guinness.");

        // Harp Lager
        values.put(Database.NAME[1], "harp_lager_001");
        values.put(Database.NAME[2], "Harp Lager");
        values.put(Database.NAME[3], 372);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Harp Lager.");

        // Heineken
        values.put(Database.NAME[1], "heineken_001");
        values.put(Database.NAME[2], "Heineken");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Heineken.");

        // Hoegaarden
        values.put(Database.NAME[1], "hoegaarden_001");
        values.put(Database.NAME[2], "Heineken");
        values.put(Database.NAME[3], 56);
        values.put(Database.NAME[4], 6);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Hoegaarden.");

        // Hofbrau
        values.put(Database.NAME[1], "hofbrau_001");
        values.put(Database.NAME[2], "Hofbrau");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Hofbrau.");

        // Hollandia
        values.put(Database.NAME[1], "hollandia_001");
        values.put(Database.NAME[2], "Hollandia");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Hollandia.");

        // Holsten
        values.put(Database.NAME[1], "holsten_001");
        values.put(Database.NAME[2], "Holsten");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Holsten.");

        // Imperial
        values.put(Database.NAME[1], "imperial_001");
        values.put(Database.NAME[2], "Imperial");
        values.put(Database.NAME[3], 188);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Imperial.");

        // Janacek
        values.put(Database.NAME[1], "janacek_001");
        values.put(Database.NAME[2], "Janacek");
        values.put(Database.NAME[3], 203);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Janacek.");

        // Kaiser Cerveja
        values.put(Database.NAME[1], "kaiser_cerveja_001");
        values.put(Database.NAME[2], "Kaiser Cerveja");
        values.put(Database.NAME[3], 76);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Kaiser Cerveja.");

        // Karpackie
        values.put(Database.NAME[1], "karpackie_001");
        values.put(Database.NAME[2], "Karpackie");
        values.put(Database.NAME[3], 616);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Karpackie.");

        // Kirin
        values.put(Database.NAME[1], "kirin_001");
        values.put(Database.NAME[2], "Kirin");
        values.put(Database.NAME[3], 392);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Kirin.");

        // Koenig
        values.put(Database.NAME[1], "koenig_001");
        values.put(Database.NAME[2], "Kirin");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Koenig.");

        // Krombacher
        values.put(Database.NAME[1], "krombacher_001");
        values.put(Database.NAME[2], "Krombacher");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Krombacher.");

        // Kronenbourg
        values.put(Database.NAME[1], "kronenbourg_001");
        values.put(Database.NAME[2], "Kronenbourg");
        values.put(Database.NAME[3], 250);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Kronenbourg.");

        // Lav Pivo
        values.put(Database.NAME[1], "lav_pivo_001");
        values.put(Database.NAME[2], "Kronenbourg");
        values.put(Database.NAME[3], 688);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Lav Pivo.");

        // Newcastle Brown Ale
        values.put(Database.NAME[1], "newcastle_brown_ale_001");
        values.put(Database.NAME[2], "Newcastle Brown Ale");
        values.put(Database.NAME[3], 829);
        values.put(Database.NAME[4], 20);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Newcastle Brown Ale.");

        // Lomz
        values.put(Database.NAME[1], "lomz_001");
        values.put(Database.NAME[2], "Lomz");
        values.put(Database.NAME[3], 616);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Lomz.");

        // Lowenbrau
        values.put(Database.NAME[1], "lowenbrau_001");
        values.put(Database.NAME[2], "Lowenbrau");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Lowenbrau.");

        // Michelob
        values.put(Database.NAME[1], "michelob_001");
        values.put(Database.NAME[2], "Michelob");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Michelob.");

        // Miller
        values.put(Database.NAME[1], "miller_001");
        values.put(Database.NAME[2], "Miller");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Miller.");

        // Molson
        values.put(Database.NAME[1], "molson_001");
        values.put(Database.NAME[2], "Molson");
        values.put(Database.NAME[3], 124);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Molson.");

        // Obolon
        values.put(Database.NAME[1], "obolon_001");
        values.put(Database.NAME[2], "Obolon");
        values.put(Database.NAME[3], 804);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Obolon.");

        // Oranjeboom
        values.put(Database.NAME[1], "oranjeboom_001");
        values.put(Database.NAME[2], "Oranjeboom");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Oranjeboom.");

        // Ottakringer
        values.put(Database.NAME[1], "ottakringer_001");
        values.put(Database.NAME[2], "Ottakringer");
        values.put(Database.NAME[3], 40);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Ottakringer.");

        // Ozujsko pivo
        values.put(Database.NAME[1], "ozujsko_pivo_001");
        values.put(Database.NAME[2], "Ozujsko pivo");
        values.put(Database.NAME[3], 56);
        values.put(Database.NAME[4], 6);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Ozujsko pivo.");

        // Paulaner
        values.put(Database.NAME[1], "paulaner_001");
        values.put(Database.NAME[2], "Paulaner");
        values.put(Database.NAME[3], 273);
        values.put(Database.NAME[4], 7);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Paulaner.");

        // Pilsen Callao
        values.put(Database.NAME[1], "pilsen_callao_001");
        values.put(Database.NAME[2], "Paulaner");
        values.put(Database.NAME[3], 604);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Pilsen Callao.");

        // Polar
        values.put(Database.NAME[1], "polar_001");
        values.put(Database.NAME[2], "Polar");
        values.put(Database.NAME[3], 862);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Polar.");

        // Presidente
        values.put(Database.NAME[1], "presidente_001");
        values.put(Database.NAME[2], "Presidente");
        values.put(Database.NAME[3], 29);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Presidente.");

        // Samuel Adams
        values.put(Database.NAME[1], "samuel_adams_001");
        values.put(Database.NAME[2], "Samuel Adams");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Samuel Adams.");

        // San Miguel
        values.put(Database.NAME[1], "san_miguel_001");
        values.put(Database.NAME[2], "San Miguel");
        values.put(Database.NAME[3], 724);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting San Miguel.");

        // Sarmat
        values.put(Database.NAME[1], "sarmat_001");
        values.put(Database.NAME[2], "Sarmat");
        values.put(Database.NAME[3], 804);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Sarmat.");

        // Schlitz
        values.put(Database.NAME[1], "schlitz_001");
        values.put(Database.NAME[2], "Schlitz");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Schlitz.");

        // Schultenbrau
        values.put(Database.NAME[1], "schultenbrau_001");
        values.put(Database.NAME[2], "Schultenbrau");
        values.put(Database.NAME[3], 528);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Schultenbrau.");

        // Shiner Bock
        values.put(Database.NAME[1], "shiner_bock_001");
        values.put(Database.NAME[2], "Shiner Bock");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Shiner Bock.");

        // Skopsko
        values.put(Database.NAME[1], "skopsko_001");
        values.put(Database.NAME[2], "Skopsko");
        values.put(Database.NAME[3], 807);
        values.put(Database.NAME[4], 3);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Skopsko.");

        // Smithwick's
        values.put(Database.NAME[1], "smithwicks_001");
        values.put(Database.NAME[2], "Smithwick's");
        values.put(Database.NAME[3], 372);
        values.put(Database.NAME[4], 20);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Smithwick's.");

        // Spaten
        values.put(Database.NAME[1], "spaten_001");
        values.put(Database.NAME[2], "Spaten");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 20);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Spaten.");

        // Stella Artois
        values.put(Database.NAME[1], "stella_artois_001");
        values.put(Database.NAME[2], "Stella Artois");
        values.put(Database.NAME[3], 56);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Stella Artois.");

        // Stiegl
        values.put(Database.NAME[1], "stiegl_001");
        values.put(Database.NAME[2], "Stiegl");
        values.put(Database.NAME[3], 276);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Stiegl.");

        // Stolichno Bock
        values.put(Database.NAME[1], "stolichno_bock_001");
        values.put(Database.NAME[2], "Stolichno Bock");
        values.put(Database.NAME[3], 100);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Stolichno Bock.");

        // Stroh's
        values.put(Database.NAME[1], "strohs_001");
        values.put(Database.NAME[2], "Stroh's");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Stroh's.");

        // Super Bock
        values.put(Database.NAME[1], "super_bock_001");
        values.put(Database.NAME[2], "Super Bock");
        values.put(Database.NAME[3], 620);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Super Bock.");

        // TECATE
        values.put(Database.NAME[1], "tecate_001");
        values.put(Database.NAME[2], "TECATE");
        values.put(Database.NAME[3], 484);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting TECATE.");

        // TIBURON
        values.put(Database.NAME[1], "tiburon_001");
        values.put(Database.NAME[2], "TIBURON");
        values.put(Database.NAME[3], 840);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting TIBURON.");

        // Tiger
        values.put(Database.NAME[1], "tiger_001");
        values.put(Database.NAME[2], "Tiger");
        values.put(Database.NAME[3], 702);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Tiger.");

        // Tooheys
        values.put(Database.NAME[1], "tooheys_001");
        values.put(Database.NAME[2], "Tooheys");
        values.put(Database.NAME[3], 36);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Tooheys.");

        // Tuborg
        values.put(Database.NAME[1], "tuborg_001");
        values.put(Database.NAME[2], "Tuborg");
        values.put(Database.NAME[3], 208);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Tuborg.");

        // Zywiec
        values.put(Database.NAME[1], "zywiec_001");
        values.put(Database.NAME[2], "Zywiec");
        values.put(Database.NAME[3], 616);
        values.put(Database.NAME[4], 1);
        values.put(Database.NAME[5], 1);
        db.insert(Database.TABLES[1], null, values);
        Log.i(TAG, "Inserting Tuborg.");
    }

    // Insert default data for Country
    public static void InsertCountry(SQLiteDatabase db) {
        values.clear();

        // Burundi
        values.put(Database.COUNTRY[1], 108);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Burundi");
        values.put(Database.COUNTRY[4], "Burundi");
        values.put(Database.COUNTRY[5], "Burundi");
        values.put(Database.COUNTRY[6], "Burundi");
        values.put(Database.COUNTRY[7], "Burundi");
        db.insert(Database.TABLES[2], null, values);

        // Comoros
        values.put(Database.COUNTRY[1], 108);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Comoros");
        values.put(Database.COUNTRY[4], "Comoros");
        values.put(Database.COUNTRY[5], "Comoros");
        values.put(Database.COUNTRY[6], "Comoros");
        values.put(Database.COUNTRY[7], "Comoros");
        db.insert(Database.TABLES[2], null, values);

        // Djibouti
        values.put(Database.COUNTRY[1], 262);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Djibouti");
        values.put(Database.COUNTRY[4], "Djibouti");
        values.put(Database.COUNTRY[5], "Djibouti");
        values.put(Database.COUNTRY[6], "Djibouti");
        values.put(Database.COUNTRY[7], "Djibouti");
        db.insert(Database.TABLES[2], null, values);

        // Eritrea
        values.put(Database.COUNTRY[1], 232);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Eritrea");
        values.put(Database.COUNTRY[4], "Eritrea");
        values.put(Database.COUNTRY[5], "Eritrea");
        values.put(Database.COUNTRY[6], "Eritrea");
        values.put(Database.COUNTRY[7], "Eritrea");
        db.insert(Database.TABLES[2], null, values);

        // Ethiopia
        values.put(Database.COUNTRY[1], 231);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Ethiopia");
        values.put(Database.COUNTRY[4], "Ethiopia");
        values.put(Database.COUNTRY[5], "Ethiopia");
        values.put(Database.COUNTRY[6], "Ethiopia");
        values.put(Database.COUNTRY[7], "Ethiopia");
        db.insert(Database.TABLES[2], null, values);

        // Kenya
        values.put(Database.COUNTRY[1], 404);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Kenya");
        values.put(Database.COUNTRY[4], "Kenya");
        values.put(Database.COUNTRY[5], "Kenya");
        values.put(Database.COUNTRY[6], "Kenya");
        values.put(Database.COUNTRY[7], "Kenya");
        db.insert(Database.TABLES[2], null, values);

        // Madagascar
        values.put(Database.COUNTRY[1], 450);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Madagascar");
        values.put(Database.COUNTRY[4], "Madagascar");
        values.put(Database.COUNTRY[5], "Madagascar");
        values.put(Database.COUNTRY[6], "Madagascar");
        values.put(Database.COUNTRY[7], "Madagascar");
        db.insert(Database.TABLES[2], null, values);

        // Malawi
        values.put(Database.COUNTRY[1], 454);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Malawi");
        values.put(Database.COUNTRY[4], "Malawi");
        values.put(Database.COUNTRY[5], "Malawi");
        values.put(Database.COUNTRY[6], "Malawi");
        values.put(Database.COUNTRY[7], "Malawi");
        db.insert(Database.TABLES[2], null, values);

        // Mauritius
        values.put(Database.COUNTRY[1], 480);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Mauritius");
        values.put(Database.COUNTRY[4], "Mauritius");
        values.put(Database.COUNTRY[5], "Mauritius");
        values.put(Database.COUNTRY[6], "Mauritius");
        values.put(Database.COUNTRY[7], "Mauritius");
        db.insert(Database.TABLES[2], null, values);

        // Mayotte
        values.put(Database.COUNTRY[1], 175);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Mayotte");
        values.put(Database.COUNTRY[4], "Mayotte");
        values.put(Database.COUNTRY[5], "Mayotte");
        values.put(Database.COUNTRY[6], "Mayotte");
        values.put(Database.COUNTRY[7], "Mayotte");
        db.insert(Database.TABLES[2], null, values);

        // Mozambique
        values.put(Database.COUNTRY[1], 508);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Mozambique");
        values.put(Database.COUNTRY[4], "Mozambique");
        values.put(Database.COUNTRY[5], "Mozambique");
        values.put(Database.COUNTRY[6], "Mozambique");
        values.put(Database.COUNTRY[7], "Mozambique");
        db.insert(Database.TABLES[2], null, values);

        // Réunion
        values.put(Database.COUNTRY[1], 638);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Réunion");
        values.put(Database.COUNTRY[4], "Réunion");
        values.put(Database.COUNTRY[5], "Réunion");
        values.put(Database.COUNTRY[6], "Réunion");
        values.put(Database.COUNTRY[7], "Réunion");
        db.insert(Database.TABLES[2], null, values);

        // Rwanda
        values.put(Database.COUNTRY[1], 646);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Rwanda");
        values.put(Database.COUNTRY[4], "Rwanda");
        values.put(Database.COUNTRY[5], "Rwanda");
        values.put(Database.COUNTRY[6], "Rwanda");
        values.put(Database.COUNTRY[7], "Rwanda");
        db.insert(Database.TABLES[2], null, values);

        // Seychelles
        values.put(Database.COUNTRY[1], 690);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Seychelles");
        values.put(Database.COUNTRY[4], "Seychelles");
        values.put(Database.COUNTRY[5], "Seychelles");
        values.put(Database.COUNTRY[6], "Seychelles");
        values.put(Database.COUNTRY[7], "Seychelles");
        db.insert(Database.TABLES[2], null, values);

        // Somalia
        values.put(Database.COUNTRY[1], 706);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Somalia");
        values.put(Database.COUNTRY[4], "Somalia");
        values.put(Database.COUNTRY[5], "Somalia");
        values.put(Database.COUNTRY[6], "Somalia");
        values.put(Database.COUNTRY[7], "Somalia");
        db.insert(Database.TABLES[2], null, values);

        // South Sudan
        values.put(Database.COUNTRY[1], 728);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "South Sudan");
        values.put(Database.COUNTRY[4], "South Sudan");
        values.put(Database.COUNTRY[5], "South Sudan");
        values.put(Database.COUNTRY[6], "South Sudan");
        values.put(Database.COUNTRY[7], "South Sudan");
        db.insert(Database.TABLES[2], null, values);

        // Uganda
        values.put(Database.COUNTRY[1], 800);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Uganda");
        values.put(Database.COUNTRY[4], "Uganda");
        values.put(Database.COUNTRY[5], "Uganda");
        values.put(Database.COUNTRY[6], "Uganda");
        values.put(Database.COUNTRY[7], "Uganda");
        db.insert(Database.TABLES[2], null, values);

        // United Republic of Tanzania
        values.put(Database.COUNTRY[1], 834);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "United Republic of Tanzania");
        values.put(Database.COUNTRY[4], "United Republic of Tanzania");
        values.put(Database.COUNTRY[5], "United Republic of Tanzania");
        values.put(Database.COUNTRY[6], "United Republic of Tanzania");
        values.put(Database.COUNTRY[7], "United Republic of Tanzania");
        db.insert(Database.TABLES[2], null, values);

        // Zambia
        values.put(Database.COUNTRY[1], 894);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Zambia");
        values.put(Database.COUNTRY[4], "Zambia");
        values.put(Database.COUNTRY[5], "Zambia");
        values.put(Database.COUNTRY[6], "Zambia");
        values.put(Database.COUNTRY[7], "Zambia");
        db.insert(Database.TABLES[2], null, values);

        // Zimbabwe
        values.put(Database.COUNTRY[1], 716);
        values.put(Database.COUNTRY[2], 14);
        values.put(Database.COUNTRY[3], "Zimbabwe");
        values.put(Database.COUNTRY[4], "Zimbabwe");
        values.put(Database.COUNTRY[5], "Zimbabwe");
        values.put(Database.COUNTRY[6], "Zimbabwe");
        values.put(Database.COUNTRY[7], "Zimbabwe");
        db.insert(Database.TABLES[2], null, values);

        // Angola
        values.put(Database.COUNTRY[1], 24);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Angola");
        values.put(Database.COUNTRY[4], "Angola");
        values.put(Database.COUNTRY[5], "Angola");
        values.put(Database.COUNTRY[6], "Angola");
        values.put(Database.COUNTRY[7], "Angola");
        db.insert(Database.TABLES[2], null, values);

        // Cameroon
        values.put(Database.COUNTRY[1], 120);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Cameroon");
        values.put(Database.COUNTRY[4], "Cameroon");
        values.put(Database.COUNTRY[5], "Cameroon");
        values.put(Database.COUNTRY[6], "Cameroon");
        values.put(Database.COUNTRY[7], "Cameroon");
        db.insert(Database.TABLES[2], null, values);

        // Central African Republic
        values.put(Database.COUNTRY[1], 140);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Central African Republic");
        values.put(Database.COUNTRY[4], "Central African Republic");
        values.put(Database.COUNTRY[5], "Central African Republic");
        values.put(Database.COUNTRY[6], "Central African Republic");
        values.put(Database.COUNTRY[7], "Central African Republic");
        db.insert(Database.TABLES[2], null, values);

        // Chad
        values.put(Database.COUNTRY[1], 148);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Chad");
        values.put(Database.COUNTRY[4], "Chad");
        values.put(Database.COUNTRY[5], "Chad");
        values.put(Database.COUNTRY[6], "Chad");
        values.put(Database.COUNTRY[7], "Chad");
        db.insert(Database.TABLES[2], null, values);

        // Congo
        values.put(Database.COUNTRY[1], 178);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Congo");
        values.put(Database.COUNTRY[4], "Congo");
        values.put(Database.COUNTRY[5], "Congo");
        values.put(Database.COUNTRY[6], "Congo");
        values.put(Database.COUNTRY[7], "Congo");
        db.insert(Database.TABLES[2], null, values);

        // Democratic Republic of the Congo
        values.put(Database.COUNTRY[1], 180);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Democratic Republic of the Congo");
        values.put(Database.COUNTRY[4], "Democratic Republic of the Congo");
        values.put(Database.COUNTRY[5], "Democratic Republic of the Congo");
        values.put(Database.COUNTRY[6], "Democratic Republic of the Congo");
        values.put(Database.COUNTRY[7], "Democratic Republic of the Congo");
        db.insert(Database.TABLES[2], null, values);

        // Equatorial Guinea
        values.put(Database.COUNTRY[1], 226);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Equatorial Guinea");
        values.put(Database.COUNTRY[4], "Equatorial Guinea");
        values.put(Database.COUNTRY[5], "Equatorial Guinea");
        values.put(Database.COUNTRY[6], "Equatorial Guinea");
        values.put(Database.COUNTRY[7], "Equatorial Guinea");
        db.insert(Database.TABLES[2], null, values);

        // Gabon
        values.put(Database.COUNTRY[1], 266);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Gabon");
        values.put(Database.COUNTRY[4], "Gabon");
        values.put(Database.COUNTRY[5], "Gabon");
        values.put(Database.COUNTRY[6], "Gabon");
        values.put(Database.COUNTRY[7], "Gabon");
        db.insert(Database.TABLES[2], null, values);

        // Sao Tome and Principe
        values.put(Database.COUNTRY[1], 678);
        values.put(Database.COUNTRY[2], 17);
        values.put(Database.COUNTRY[3], "Sao Tome and Principe");
        values.put(Database.COUNTRY[4], "Sao Tome and Principe");
        values.put(Database.COUNTRY[5], "Sao Tome and Principe");
        values.put(Database.COUNTRY[6], "Sao Tome and Principe");
        values.put(Database.COUNTRY[7], "Sao Tome and Principe");
        db.insert(Database.TABLES[2], null, values);

        // Algeria
        values.put(Database.COUNTRY[1], 678);
        values.put(Database.COUNTRY[2], 12);
        values.put(Database.COUNTRY[3], "Algeria");
        values.put(Database.COUNTRY[4], "Algeria");
        values.put(Database.COUNTRY[5], "Algeria");
        values.put(Database.COUNTRY[6], "Algeria");
        values.put(Database.COUNTRY[7], "Algeria");
        db.insert(Database.TABLES[2], null, values);

        // Egypt
        values.put(Database.COUNTRY[1], 818);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Egypt");
        values.put(Database.COUNTRY[4], "Egypt");
        values.put(Database.COUNTRY[5], "Egypt");
        values.put(Database.COUNTRY[6], "Egypt");
        values.put(Database.COUNTRY[7], "Egypt");
        db.insert(Database.TABLES[2], null, values);

        // Libya
        values.put(Database.COUNTRY[1], 434);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Libya");
        values.put(Database.COUNTRY[4], "Libya");
        values.put(Database.COUNTRY[5], "Libya");
        values.put(Database.COUNTRY[6], "Libya");
        values.put(Database.COUNTRY[7], "Libya");
        db.insert(Database.TABLES[2], null, values);

        // Morocco
        values.put(Database.COUNTRY[1], 504);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Morocco");
        values.put(Database.COUNTRY[4], "Morocco");
        values.put(Database.COUNTRY[5], "Morocco");
        values.put(Database.COUNTRY[6], "Morocco");
        values.put(Database.COUNTRY[7], "Morocco");
        db.insert(Database.TABLES[2], null, values);

        // Sudan
        values.put(Database.COUNTRY[1], 729);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Sudan");
        values.put(Database.COUNTRY[4], "Sudan");
        values.put(Database.COUNTRY[5], "Sudan");
        values.put(Database.COUNTRY[6], "Sudan");
        values.put(Database.COUNTRY[7], "Sudan");
        db.insert(Database.TABLES[2], null, values);

        // Tunisia
        values.put(Database.COUNTRY[1], 788);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Tunisia");
        values.put(Database.COUNTRY[4], "Tunisia");
        values.put(Database.COUNTRY[5], "Tunisia");
        values.put(Database.COUNTRY[6], "Tunisia");
        values.put(Database.COUNTRY[7], "Tunisia");
        db.insert(Database.TABLES[2], null, values);

        // Western Sahara
        values.put(Database.COUNTRY[1], 732);
        values.put(Database.COUNTRY[2], 15);
        values.put(Database.COUNTRY[3], "Western Sahara");
        values.put(Database.COUNTRY[4], "Western Sahara");
        values.put(Database.COUNTRY[5], "Western Sahara");
        values.put(Database.COUNTRY[6], "Western Sahara");
        values.put(Database.COUNTRY[7], "Western Sahara");
        db.insert(Database.TABLES[2], null, values);

        // Botswana
        values.put(Database.COUNTRY[1], 72);
        values.put(Database.COUNTRY[2], 18);
        values.put(Database.COUNTRY[3], "Botswana");
        values.put(Database.COUNTRY[4], "Botswana");
        values.put(Database.COUNTRY[5], "Botswana");
        values.put(Database.COUNTRY[6], "Botswana");
        values.put(Database.COUNTRY[7], "Botswana");
        db.insert(Database.TABLES[2], null, values);

        // Lesotho
        values.put(Database.COUNTRY[1], 426);
        values.put(Database.COUNTRY[2], 18);
        values.put(Database.COUNTRY[3], "Lesotho");
        values.put(Database.COUNTRY[4], "Lesotho");
        values.put(Database.COUNTRY[5], "Lesotho");
        values.put(Database.COUNTRY[6], "Lesotho");
        values.put(Database.COUNTRY[7], "Lesotho");
        db.insert(Database.TABLES[2], null, values);

        // Namibia
        values.put(Database.COUNTRY[1], 516);
        values.put(Database.COUNTRY[2], 18);
        values.put(Database.COUNTRY[3], "Namibia");
        values.put(Database.COUNTRY[4], "Namibia");
        values.put(Database.COUNTRY[5], "Namibia");
        values.put(Database.COUNTRY[6], "Namibia");
        values.put(Database.COUNTRY[7], "Namibia");
        db.insert(Database.TABLES[2], null, values);

        // South Africa
        values.put(Database.COUNTRY[1], 710);
        values.put(Database.COUNTRY[2], 18);
        values.put(Database.COUNTRY[3], "South Africa");
        values.put(Database.COUNTRY[4], "South Africa");
        values.put(Database.COUNTRY[5], "South Africa");
        values.put(Database.COUNTRY[6], "South Africa");
        values.put(Database.COUNTRY[7], "South Africa");
        db.insert(Database.TABLES[2], null, values);

        // Swaziland
        values.put(Database.COUNTRY[1], 748);
        values.put(Database.COUNTRY[2], 18);
        values.put(Database.COUNTRY[3], "Swaziland");
        values.put(Database.COUNTRY[4], "Swaziland");
        values.put(Database.COUNTRY[5], "Swaziland");
        values.put(Database.COUNTRY[6], "Swaziland");
        values.put(Database.COUNTRY[7], "Swaziland");
        db.insert(Database.TABLES[2], null, values);

        // Benin
        values.put(Database.COUNTRY[1], 204);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Benin");
        values.put(Database.COUNTRY[4], "Benin");
        values.put(Database.COUNTRY[5], "Benin");
        values.put(Database.COUNTRY[6], "Benin");
        values.put(Database.COUNTRY[7], "Benin");
        db.insert(Database.TABLES[2], null, values);

        // Burkina Faso
        values.put(Database.COUNTRY[1], 854);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Burkina Faso");
        values.put(Database.COUNTRY[4], "Burkina Faso");
        values.put(Database.COUNTRY[5], "Burkina Faso");
        values.put(Database.COUNTRY[6], "Burkina Faso");
        values.put(Database.COUNTRY[7], "Burkina Faso");
        db.insert(Database.TABLES[2], null, values);

        // Cabo Verde
        values.put(Database.COUNTRY[1], 132);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Cabo Verde");
        values.put(Database.COUNTRY[4], "Cabo Verde");
        values.put(Database.COUNTRY[5], "Cabo Verde");
        values.put(Database.COUNTRY[6], "Cabo Verde");
        values.put(Database.COUNTRY[7], "Cabo Verde");
        db.insert(Database.TABLES[2], null, values);

        // Cote d'Ivoire
        values.put(Database.COUNTRY[1], 384);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Cote d'Ivoire");
        values.put(Database.COUNTRY[4], "Cote d'Ivoire");
        values.put(Database.COUNTRY[5], "Cote d'Ivoire");
        values.put(Database.COUNTRY[6], "Cote d'Ivoire");
        values.put(Database.COUNTRY[7], "Cote d'Ivoire");
        db.insert(Database.TABLES[2], null, values);

        // Gambia
        values.put(Database.COUNTRY[1], 270);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Gambia");
        values.put(Database.COUNTRY[4], "Gambia");
        values.put(Database.COUNTRY[5], "Gambia");
        values.put(Database.COUNTRY[6], "Gambia");
        values.put(Database.COUNTRY[7], "Gambia");
        db.insert(Database.TABLES[2], null, values);

        // Ghana
        values.put(Database.COUNTRY[1], 288);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Ghana");
        values.put(Database.COUNTRY[4], "Ghana");
        values.put(Database.COUNTRY[5], "Ghana");
        values.put(Database.COUNTRY[6], "Ghana");
        values.put(Database.COUNTRY[7], "Ghana");
        db.insert(Database.TABLES[2], null, values);

        // Guinea
        values.put(Database.COUNTRY[1], 324);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Guinea");
        values.put(Database.COUNTRY[4], "Guinea");
        values.put(Database.COUNTRY[5], "Guinea");
        values.put(Database.COUNTRY[6], "Guinea");
        values.put(Database.COUNTRY[7], "Guinea");
        db.insert(Database.TABLES[2], null, values);

        // Guinea-Bissau
        values.put(Database.COUNTRY[1], 624);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Guinea-Bissau");
        values.put(Database.COUNTRY[4], "Guinea-Bissau");
        values.put(Database.COUNTRY[5], "Guinea-Bissau");
        values.put(Database.COUNTRY[6], "Guinea-Bissau");
        values.put(Database.COUNTRY[7], "Guinea-Bissau");
        db.insert(Database.TABLES[2], null, values);

        // Liberia
        values.put(Database.COUNTRY[1], 430);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Liberia");
        values.put(Database.COUNTRY[4], "Liberia");
        values.put(Database.COUNTRY[5], "Liberia");
        values.put(Database.COUNTRY[6], "Liberia");
        values.put(Database.COUNTRY[7], "Liberia");
        db.insert(Database.TABLES[2], null, values);

        // Mali
        values.put(Database.COUNTRY[1], 466);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Mali");
        values.put(Database.COUNTRY[4], "Mali");
        values.put(Database.COUNTRY[5], "Mali");
        values.put(Database.COUNTRY[6], "Mali");
        values.put(Database.COUNTRY[7], "Mali");
        db.insert(Database.TABLES[2], null, values);

        // Mauritania
        values.put(Database.COUNTRY[1], 478);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Mauritania");
        values.put(Database.COUNTRY[4], "Mauritania");
        values.put(Database.COUNTRY[5], "Mauritania");
        values.put(Database.COUNTRY[6], "Mauritania");
        values.put(Database.COUNTRY[7], "Mauritania");
        db.insert(Database.TABLES[2], null, values);

        // Niger
        values.put(Database.COUNTRY[1], 562);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Niger");
        values.put(Database.COUNTRY[4], "Niger");
        values.put(Database.COUNTRY[5], "Niger");
        values.put(Database.COUNTRY[6], "Niger");
        values.put(Database.COUNTRY[7], "Niger");
        db.insert(Database.TABLES[2], null, values);

        // Nigeria
        values.put(Database.COUNTRY[1], 566);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Nigeria");
        values.put(Database.COUNTRY[4], "Nigeria");
        values.put(Database.COUNTRY[5], "Nigeria");
        values.put(Database.COUNTRY[6], "Nigeria");
        values.put(Database.COUNTRY[7], "Nigeria");
        db.insert(Database.TABLES[2], null, values);

        // Saint Helena
        values.put(Database.COUNTRY[1], 654);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Saint Helena");
        values.put(Database.COUNTRY[4], "Saint Helena");
        values.put(Database.COUNTRY[5], "Saint Helena");
        values.put(Database.COUNTRY[6], "Saint Helena");
        values.put(Database.COUNTRY[7], "Saint Helena");
        db.insert(Database.TABLES[2], null, values);

        // Senegal
        values.put(Database.COUNTRY[1], 686);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Senegal");
        values.put(Database.COUNTRY[4], "Senegal");
        values.put(Database.COUNTRY[5], "Senegal");
        values.put(Database.COUNTRY[6], "Senegal");
        values.put(Database.COUNTRY[7], "Senegal");
        db.insert(Database.TABLES[2], null, values);

        // Sierra Leone
        values.put(Database.COUNTRY[1], 694);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Sierra Leone");
        values.put(Database.COUNTRY[4], "Sierra Leone");
        values.put(Database.COUNTRY[5], "Sierra Leone");
        values.put(Database.COUNTRY[6], "Sierra Leone");
        values.put(Database.COUNTRY[7], "Sierra Leone");
        db.insert(Database.TABLES[2], null, values);

        // Togo
        values.put(Database.COUNTRY[1], 768);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Togo");
        values.put(Database.COUNTRY[4], "Togo");
        values.put(Database.COUNTRY[5], "Togo");
        values.put(Database.COUNTRY[6], "Togo");
        values.put(Database.COUNTRY[7], "Togo");
        db.insert(Database.TABLES[2], null, values);

        // Anguilla
        values.put(Database.COUNTRY[1], 660);
        values.put(Database.COUNTRY[2], 11);
        values.put(Database.COUNTRY[3], "Anguilla");
        values.put(Database.COUNTRY[4], "Anguilla");
        values.put(Database.COUNTRY[5], "Anguilla");
        values.put(Database.COUNTRY[6], "Anguilla");
        values.put(Database.COUNTRY[7], "Anguilla");
        db.insert(Database.TABLES[2], null, values);

        // Antigua and Barbuda
        values.put(Database.COUNTRY[1], 29);
        values.put(Database.COUNTRY[2], 28);
        values.put(Database.COUNTRY[3], "Antigua and Barbuda");
        values.put(Database.COUNTRY[4], "Antigua and Barbuda");
        values.put(Database.COUNTRY[5], "Antigua and Barbuda");
        values.put(Database.COUNTRY[6], "Antigua and Barbuda");
        values.put(Database.COUNTRY[7], "Antigua and Barbuda");
        db.insert(Database.TABLES[2], null, values);

        // Antigua and Barbuda
        values.put(Database.COUNTRY[1], 29);
        values.put(Database.COUNTRY[2], 28);
        values.put(Database.COUNTRY[3], "Antigua and Barbuda");
        values.put(Database.COUNTRY[4], "Antigua and Barbuda");
        values.put(Database.COUNTRY[5], "Antigua and Barbuda");
        values.put(Database.COUNTRY[6], "Antigua and Barbuda");
        values.put(Database.COUNTRY[7], "Antigua and Barbuda");
        db.insert(Database.TABLES[2], null, values);

        // Aruba
        values.put(Database.COUNTRY[1], 523);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Aruba");
        values.put(Database.COUNTRY[4], "Aruba");
        values.put(Database.COUNTRY[5], "Aruba");
        values.put(Database.COUNTRY[6], "Aruba");
        values.put(Database.COUNTRY[7], "Aruba");
        db.insert(Database.TABLES[2], null, values);

        // Bahamas
        values.put(Database.COUNTRY[1], 44);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Bahamas");
        values.put(Database.COUNTRY[4], "Bahamas");
        values.put(Database.COUNTRY[5], "Bahamas");
        values.put(Database.COUNTRY[6], "Bahamas");
        values.put(Database.COUNTRY[7], "Bahamas");
        db.insert(Database.TABLES[2], null, values);

        // Barbados
        values.put(Database.COUNTRY[1], 52);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Barbados");
        values.put(Database.COUNTRY[4], "Barbados");
        values.put(Database.COUNTRY[5], "Barbados");
        values.put(Database.COUNTRY[6], "Barbados");
        values.put(Database.COUNTRY[7], "Barbados");
        db.insert(Database.TABLES[2], null, values);

        // Bonaire, Saint Eustatius and Saba
        values.put(Database.COUNTRY[1], 535);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Bonaire, Saint Eustatius and Saba");
        values.put(Database.COUNTRY[4], "Bonaire, Saint Eustatius and Saba");
        values.put(Database.COUNTRY[5], "Bonaire, Saint Eustatius and Saba");
        values.put(Database.COUNTRY[6], "Bonaire, Saint Eustatius and Saba");
        values.put(Database.COUNTRY[7], "Bonaire, Saint Eustatius and Saba");
        db.insert(Database.TABLES[2], null, values);

        // British Virgin Islands
        values.put(Database.COUNTRY[1], 92);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "British Virgin Islands");
        values.put(Database.COUNTRY[4], "British Virgin Islands");
        values.put(Database.COUNTRY[5], "British Virgin Islands");
        values.put(Database.COUNTRY[6], "British Virgin Islands");
        values.put(Database.COUNTRY[7], "British Virgin Islands");
        db.insert(Database.TABLES[2], null, values);

        // Cayman Islands
        values.put(Database.COUNTRY[1], 136);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Cayman Islands");
        values.put(Database.COUNTRY[4], "Cayman Islands");
        values.put(Database.COUNTRY[5], "Cayman Islands");
        values.put(Database.COUNTRY[6], "Cayman Islands");
        values.put(Database.COUNTRY[7], "Cayman Islands");
        db.insert(Database.TABLES[2], null, values);

        // Cuba
        values.put(Database.COUNTRY[1], 192);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Cuba");
        values.put(Database.COUNTRY[4], "Cuba");
        values.put(Database.COUNTRY[5], "Cuba");
        values.put(Database.COUNTRY[6], "Cuba");
        values.put(Database.COUNTRY[7], "Cuba");
        db.insert(Database.TABLES[2], null, values);

        // Curaçao
        values.put(Database.COUNTRY[1], 531);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Curaçao");
        values.put(Database.COUNTRY[4], "Curaçao");
        values.put(Database.COUNTRY[5], "Curaçao");
        values.put(Database.COUNTRY[6], "Curaçao");
        values.put(Database.COUNTRY[7], "Curaçao");
        db.insert(Database.TABLES[2], null, values);

        // Dominica
        values.put(Database.COUNTRY[1], 212);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Dominica");
        values.put(Database.COUNTRY[4], "Dominica");
        values.put(Database.COUNTRY[5], "Dominica");
        values.put(Database.COUNTRY[6], "Dominica");
        values.put(Database.COUNTRY[7], "Dominica");
        db.insert(Database.TABLES[2], null, values);

        // Dominican Republic
        values.put(Database.COUNTRY[1], 29);
        values.put(Database.COUNTRY[2], 214);
        values.put(Database.COUNTRY[3], "Dominican Republic");
        values.put(Database.COUNTRY[4], "Dominican Republic");
        values.put(Database.COUNTRY[5], "Dominican Republic");
        values.put(Database.COUNTRY[6], "Dominican Republic");
        values.put(Database.COUNTRY[7], "Dominican Republic");
        db.insert(Database.TABLES[2], null, values);

        // Grenada
        values.put(Database.COUNTRY[1], 308);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Grenada");
        values.put(Database.COUNTRY[4], "Grenada");
        values.put(Database.COUNTRY[5], "Grenada");
        values.put(Database.COUNTRY[6], "Grenada");
        values.put(Database.COUNTRY[7], "Grenada");
        db.insert(Database.TABLES[2], null, values);

        // Guadeloupe
        values.put(Database.COUNTRY[1], 312);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Guadeloupe");
        values.put(Database.COUNTRY[4], "Guadeloupe");
        values.put(Database.COUNTRY[5], "Guadeloupe");
        values.put(Database.COUNTRY[6], "Guadeloupe");
        values.put(Database.COUNTRY[7], "Guadeloupe");
        db.insert(Database.TABLES[2], null, values);

        // Haiti
        values.put(Database.COUNTRY[1], 332);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Haiti");
        values.put(Database.COUNTRY[4], "Haiti");
        values.put(Database.COUNTRY[5], "Haiti");
        values.put(Database.COUNTRY[6], "Haiti");
        values.put(Database.COUNTRY[7], "Haiti");
        db.insert(Database.TABLES[2], null, values);

        // Jamaica
        values.put(Database.COUNTRY[1], 388);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Jamaica");
        values.put(Database.COUNTRY[4], "Jamaica");
        values.put(Database.COUNTRY[5], "Jamaica");
        values.put(Database.COUNTRY[6], "Jamaica");
        values.put(Database.COUNTRY[7], "Jamaica");
        db.insert(Database.TABLES[2], null, values);

        // Martinique
        values.put(Database.COUNTRY[1], 474);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Martinique");
        values.put(Database.COUNTRY[4], "Martinique");
        values.put(Database.COUNTRY[5], "Martinique");
        values.put(Database.COUNTRY[6], "Martinique");
        values.put(Database.COUNTRY[7], "Martinique");
        db.insert(Database.TABLES[2], null, values);

        // Montserrat
        values.put(Database.COUNTRY[1], 500);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Montserrat");
        values.put(Database.COUNTRY[4], "Montserrat");
        values.put(Database.COUNTRY[5], "Montserrat");
        values.put(Database.COUNTRY[6], "Montserrat");
        values.put(Database.COUNTRY[7], "Montserrat");
        db.insert(Database.TABLES[2], null, values);

        // Puerto Rico
        values.put(Database.COUNTRY[1], 630);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Puerto Rico");
        values.put(Database.COUNTRY[4], "Puerto Rico");
        values.put(Database.COUNTRY[5], "Puerto Rico");
        values.put(Database.COUNTRY[6], "Puerto Rico");
        values.put(Database.COUNTRY[7], "Puerto Rico");
        db.insert(Database.TABLES[2], null, values);

        // Saint-Barthélemy
        values.put(Database.COUNTRY[1], 652);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Saint-Barthélemy");
        values.put(Database.COUNTRY[4], "Saint-Barthélemy");
        values.put(Database.COUNTRY[5], "Saint-Barthélemy");
        values.put(Database.COUNTRY[6], "Saint-Barthélemy");
        values.put(Database.COUNTRY[7], "Saint-Barthélemy");
        db.insert(Database.TABLES[2], null, values);

        // Saint Kitts and Nevis
        values.put(Database.COUNTRY[1], 659);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Saint Kitts and Nevis");
        values.put(Database.COUNTRY[4], "Saint Kitts and Nevis");
        values.put(Database.COUNTRY[5], "Saint Kitts and Nevis");
        values.put(Database.COUNTRY[6], "Saint Kitts and Nevis");
        values.put(Database.COUNTRY[7], "Saint Kitts and Nevis");
        db.insert(Database.TABLES[2], null, values);

        // Saint Lucia
        values.put(Database.COUNTRY[1], 662);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Saint Lucia");
        values.put(Database.COUNTRY[4], "Saint Lucia");
        values.put(Database.COUNTRY[5], "Saint Lucia");
        values.put(Database.COUNTRY[6], "Saint Lucia");
        values.put(Database.COUNTRY[7], "Saint Lucia");
        db.insert(Database.TABLES[2], null, values);

        // Saint Martin (French part)
        values.put(Database.COUNTRY[1], 663);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Saint Martin (French part)");
        values.put(Database.COUNTRY[4], "Saint Martin (French part)");
        values.put(Database.COUNTRY[5], "Saint Martin (French part)");
        values.put(Database.COUNTRY[6], "Saint Martin (French part)");
        values.put(Database.COUNTRY[7], "Saint Martin (French part)");
        db.insert(Database.TABLES[2], null, values);

        // Saint Vincent and the Grenadines
        values.put(Database.COUNTRY[1], 670);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Saint Vincent and the Grenadines");
        values.put(Database.COUNTRY[4], "Saint Vincent and the Grenadines");
        values.put(Database.COUNTRY[5], "Saint Vincent and the Grenadines");
        values.put(Database.COUNTRY[6], "Saint Vincent and the Grenadines");
        values.put(Database.COUNTRY[7], "Saint Vincent and the Grenadines");
        db.insert(Database.TABLES[2], null, values);

        // Sint Maarten (Dutch part)
        values.put(Database.COUNTRY[1], 534);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Sint Maarten (Dutch part)");
        values.put(Database.COUNTRY[4], "Sint Maarten (Dutch part)");
        values.put(Database.COUNTRY[5], "Sint Maarten (Dutch part)");
        values.put(Database.COUNTRY[6], "Sint Maarten (Dutch part)");
        values.put(Database.COUNTRY[7], "Sint Maarten (Dutch part)");
        db.insert(Database.TABLES[2], null, values);

        // Trinidad and Tobago
        values.put(Database.COUNTRY[1], 780);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Trinidad and Tobago");
        values.put(Database.COUNTRY[4], "Trinidad and Tobago");
        values.put(Database.COUNTRY[5], "Trinidad and Tobago");
        values.put(Database.COUNTRY[6], "Trinidad and Tobago");
        values.put(Database.COUNTRY[7], "Trinidad and Tobago");
        db.insert(Database.TABLES[2], null, values);

        // Turks and Caicos Islands
        values.put(Database.COUNTRY[1], 796);
        values.put(Database.COUNTRY[2], 29);
        values.put(Database.COUNTRY[3], "Turks and Caicos Islands");
        values.put(Database.COUNTRY[4], "Turks and Caicos Islands");
        values.put(Database.COUNTRY[5], "Turks and Caicos Islands");
        values.put(Database.COUNTRY[6], "Turks and Caicos Islands");
        values.put(Database.COUNTRY[7], "Turks and Caicos Islands");
        db.insert(Database.TABLES[2], null, values);

        // United States Virgin Islands
        values.put(Database.COUNTRY[1], 850);
        values.put(Database.COUNTRY[2], 19);
        values.put(Database.COUNTRY[3], "United States Virgin Islands");
        values.put(Database.COUNTRY[4], "United States Virgin Islands");
        values.put(Database.COUNTRY[5], "United States Virgin Islands");
        values.put(Database.COUNTRY[6], "United States Virgin Islands");
        values.put(Database.COUNTRY[7], "United States Virgin Islands");
        db.insert(Database.TABLES[2], null, values);

        // Belize
        values.put(Database.COUNTRY[1], 84);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Belize");
        values.put(Database.COUNTRY[4], "Belize");
        values.put(Database.COUNTRY[5], "Belize");
        values.put(Database.COUNTRY[6], "Belize");
        values.put(Database.COUNTRY[7], "Belize");
        db.insert(Database.TABLES[2], null, values);

        // Costa Rica
        values.put(Database.COUNTRY[1], 188);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Costa Rica");
        values.put(Database.COUNTRY[4], "Costa Rica");
        values.put(Database.COUNTRY[5], "Costa Rica");
        values.put(Database.COUNTRY[6], "Costa Rica");
        values.put(Database.COUNTRY[7], "Costa Rica");
        db.insert(Database.TABLES[2], null, values);

        // El Salvador
        values.put(Database.COUNTRY[1], 222);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "El Salvador");
        values.put(Database.COUNTRY[4], "El Salvador");
        values.put(Database.COUNTRY[5], "El Salvador");
        values.put(Database.COUNTRY[6], "El Salvador");
        values.put(Database.COUNTRY[7], "El Salvador");
        db.insert(Database.TABLES[2], null, values);

        // Guatemala
        values.put(Database.COUNTRY[1], 320);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Guatemala");
        values.put(Database.COUNTRY[4], "Guatemala");
        values.put(Database.COUNTRY[5], "Guatemala");
        values.put(Database.COUNTRY[6], "Guatemala");
        values.put(Database.COUNTRY[7], "Guatemala");
        db.insert(Database.TABLES[2], null, values);

        // Honduras
        values.put(Database.COUNTRY[1], 340);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Honduras");
        values.put(Database.COUNTRY[4], "Honduras");
        values.put(Database.COUNTRY[5], "Honduras");
        values.put(Database.COUNTRY[6], "Honduras");
        values.put(Database.COUNTRY[7], "Honduras");
        db.insert(Database.TABLES[2], null, values);

        // Mexico
        values.put(Database.COUNTRY[1], 484);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Mexico");
        values.put(Database.COUNTRY[4], "Mexico");
        values.put(Database.COUNTRY[5], "Mexico");
        values.put(Database.COUNTRY[6], "Mexico");
        values.put(Database.COUNTRY[7], "Mexico");
        db.insert(Database.TABLES[2], null, values);

        // Nicaragua
        values.put(Database.COUNTRY[1], 558);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Nicaragua");
        values.put(Database.COUNTRY[4], "Nicaragua");
        values.put(Database.COUNTRY[5], "Nicaragua");
        values.put(Database.COUNTRY[6], "Nicaragua");
        values.put(Database.COUNTRY[7], "Nicaragua");
        db.insert(Database.TABLES[2], null, values);

        // Panama
        values.put(Database.COUNTRY[1], 591);
        values.put(Database.COUNTRY[2], 13);
        values.put(Database.COUNTRY[3], "Panama");
        values.put(Database.COUNTRY[4], "Panama");
        values.put(Database.COUNTRY[5], "Panama");
        values.put(Database.COUNTRY[6], "Panama");
        values.put(Database.COUNTRY[7], "Panama");
        db.insert(Database.TABLES[2], null, values);

        // Argentina
        values.put(Database.COUNTRY[1], 32);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Argentina");
        values.put(Database.COUNTRY[4], "Argentina");
        values.put(Database.COUNTRY[5], "Argentina");
        values.put(Database.COUNTRY[6], "Argentina");
        values.put(Database.COUNTRY[7], "Argentina");
        db.insert(Database.TABLES[2], null, values);

        // Bolivia (Plurinational State of)
        values.put(Database.COUNTRY[1], 68);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Bolivia (Plurinational State of)");
        values.put(Database.COUNTRY[4], "Bolivia (Plurinational State of)");
        values.put(Database.COUNTRY[5], "Bolivia (Plurinational State of)");
        values.put(Database.COUNTRY[6], "Bolivia (Plurinational State of)");
        values.put(Database.COUNTRY[7], "Bolivia (Plurinational State of)");
        db.insert(Database.TABLES[2], null, values);

        // Brazil
        values.put(Database.COUNTRY[1], 76);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Brazil");
        values.put(Database.COUNTRY[4], "Brazil");
        values.put(Database.COUNTRY[5], "Brazil");
        values.put(Database.COUNTRY[6], "Brazil");
        values.put(Database.COUNTRY[7], "Brazil");
        db.insert(Database.TABLES[2], null, values);

        // Chile
        values.put(Database.COUNTRY[1], 152);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Chile");
        values.put(Database.COUNTRY[4], "Chile");
        values.put(Database.COUNTRY[5], "Chile");
        values.put(Database.COUNTRY[6], "Chile");
        values.put(Database.COUNTRY[7], "Chile");
        db.insert(Database.TABLES[2], null, values);

        // Colombia
        values.put(Database.COUNTRY[1], 170);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Colombia");
        values.put(Database.COUNTRY[4], "Colombia");
        values.put(Database.COUNTRY[5], "Colombia");
        values.put(Database.COUNTRY[6], "Colombia");
        values.put(Database.COUNTRY[7], "Colombia");
        db.insert(Database.TABLES[2], null, values);

        // Ecuador
        values.put(Database.COUNTRY[1], 218);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Ecuador");
        values.put(Database.COUNTRY[4], "Ecuador");
        values.put(Database.COUNTRY[5], "Ecuador");
        values.put(Database.COUNTRY[6], "Ecuador");
        values.put(Database.COUNTRY[7], "Ecuador");
        db.insert(Database.TABLES[2], null, values);

        // Falkland Islands (Malvinas)
        values.put(Database.COUNTRY[1], 238);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Falkland Islands (Malvinas)");
        values.put(Database.COUNTRY[4], "Falkland Islands (Malvinas)");
        values.put(Database.COUNTRY[5], "Falkland Islands (Malvinas)");
        values.put(Database.COUNTRY[6], "Falkland Islands (Malvinas)");
        values.put(Database.COUNTRY[7], "Falkland Islands (Malvinas)");
        db.insert(Database.TABLES[2], null, values);

        // French Guiana
        values.put(Database.COUNTRY[1], 254);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "French Guiana");
        values.put(Database.COUNTRY[4], "French Guiana");
        values.put(Database.COUNTRY[5], "French Guiana");
        values.put(Database.COUNTRY[6], "French Guiana");
        values.put(Database.COUNTRY[7], "French Guiana");
        db.insert(Database.TABLES[2], null, values);

        // Guyana
        values.put(Database.COUNTRY[1], 328);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Guyana");
        values.put(Database.COUNTRY[4], "Guyana");
        values.put(Database.COUNTRY[5], "Guyana");
        values.put(Database.COUNTRY[6], "Guyana");
        values.put(Database.COUNTRY[7], "Guyana");
        db.insert(Database.TABLES[2], null, values);

        // Paraguay
        values.put(Database.COUNTRY[1], 600);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Paraguay");
        values.put(Database.COUNTRY[4], "Paraguay");
        values.put(Database.COUNTRY[5], "Paraguay");
        values.put(Database.COUNTRY[6], "Paraguay");
        values.put(Database.COUNTRY[7], "Paraguay");
        db.insert(Database.TABLES[2], null, values);

        // Peru
        values.put(Database.COUNTRY[1], 604);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Peru");
        values.put(Database.COUNTRY[4], "Peru");
        values.put(Database.COUNTRY[5], "Peru");
        values.put(Database.COUNTRY[6], "Peru");
        values.put(Database.COUNTRY[7], "Peru");
        db.insert(Database.TABLES[2], null, values);

        // Suriname
        values.put(Database.COUNTRY[1], 740);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Suriname");
        values.put(Database.COUNTRY[4], "Suriname");
        values.put(Database.COUNTRY[5], "Suriname");
        values.put(Database.COUNTRY[6], "Suriname");
        values.put(Database.COUNTRY[7], "Suriname");
        db.insert(Database.TABLES[2], null, values);

        // Uruguay
        values.put(Database.COUNTRY[1], 858);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Uruguay");
        values.put(Database.COUNTRY[4], "Uruguay");
        values.put(Database.COUNTRY[5], "Uruguay");
        values.put(Database.COUNTRY[6], "Uruguay");
        values.put(Database.COUNTRY[7], "Uruguay");
        db.insert(Database.TABLES[2], null, values);

        // Venezuela (Bolivarian Republic of)
        values.put(Database.COUNTRY[1], 862);
        values.put(Database.COUNTRY[2], 5);
        values.put(Database.COUNTRY[3], "Venezuela (Bolivarian Republic of)");
        values.put(Database.COUNTRY[4], "Venezuela (Bolivarian Republic of)");
        values.put(Database.COUNTRY[5], "Venezuela (Bolivarian Republic of)");
        values.put(Database.COUNTRY[6], "Venezuela (Bolivarian Republic of)");
        values.put(Database.COUNTRY[7], "Venezuela (Bolivarian Republic of)");
        db.insert(Database.TABLES[2], null, values);

        // Bermuda
        values.put(Database.COUNTRY[1], 60);
        values.put(Database.COUNTRY[2], 21);
        values.put(Database.COUNTRY[3], "Bermuda");
        values.put(Database.COUNTRY[4], "Bermuda");
        values.put(Database.COUNTRY[5], "Bermuda");
        values.put(Database.COUNTRY[6], "Bermuda");
        values.put(Database.COUNTRY[7], "Bermuda");
        db.insert(Database.TABLES[2], null, values);

        // Canada
        values.put(Database.COUNTRY[1], 124);
        values.put(Database.COUNTRY[2], 21);
        values.put(Database.COUNTRY[3], "Canada");
        values.put(Database.COUNTRY[4], "Canada");
        values.put(Database.COUNTRY[5], "Canada");
        values.put(Database.COUNTRY[6], "Canada");
        values.put(Database.COUNTRY[7], "Canada");
        db.insert(Database.TABLES[2], null, values);

        // Greenland
        values.put(Database.COUNTRY[1], 304);
        values.put(Database.COUNTRY[2], 21);
        values.put(Database.COUNTRY[3], "Greenland");
        values.put(Database.COUNTRY[4], "Greenland");
        values.put(Database.COUNTRY[5], "Greenland");
        values.put(Database.COUNTRY[6], "Greenland");
        values.put(Database.COUNTRY[7], "Greenland");
        db.insert(Database.TABLES[2], null, values);

        // Saint Pierre and Miquelon
        values.put(Database.COUNTRY[1], 666);
        values.put(Database.COUNTRY[2], 21);
        values.put(Database.COUNTRY[3], "Saint Pierre and Miquelon");
        values.put(Database.COUNTRY[4], "Saint Pierre and Miquelon");
        values.put(Database.COUNTRY[5], "Saint Pierre and Miquelon");
        values.put(Database.COUNTRY[6], "Saint Pierre and Miquelon");
        values.put(Database.COUNTRY[7], "Saint Pierre and Miquelon");
        db.insert(Database.TABLES[2], null, values);

        // United States of America
        values.put(Database.COUNTRY[1], 840);
        values.put(Database.COUNTRY[2], 21);
        values.put(Database.COUNTRY[3], "United States of America");
        values.put(Database.COUNTRY[4], "United States of America");
        values.put(Database.COUNTRY[5], "United States of America");
        values.put(Database.COUNTRY[6], "United States of America");
        values.put(Database.COUNTRY[7], "United States of America");
        db.insert(Database.TABLES[2], null, values);

        // Kazakhstan
        values.put(Database.COUNTRY[1], 398);
        values.put(Database.COUNTRY[2], 143);
        values.put(Database.COUNTRY[3], "Kazakhstan");
        values.put(Database.COUNTRY[4], "Kazakhstan");
        values.put(Database.COUNTRY[5], "Kazakhstan");
        values.put(Database.COUNTRY[6], "Kazakhstan");
        values.put(Database.COUNTRY[7], "Kazakhstan");
        db.insert(Database.TABLES[2], null, values);

        // Kyrgyzstan
        values.put(Database.COUNTRY[1], 417);
        values.put(Database.COUNTRY[2], 143);
        values.put(Database.COUNTRY[3], "Kyrgyzstan");
        values.put(Database.COUNTRY[4], "Kyrgyzstan");
        values.put(Database.COUNTRY[5], "Kyrgyzstan");
        values.put(Database.COUNTRY[6], "Kyrgyzstan");
        values.put(Database.COUNTRY[7], "Kyrgyzstan");
        db.insert(Database.TABLES[2], null, values);

        // Tajikistan
        values.put(Database.COUNTRY[1], 762);
        values.put(Database.COUNTRY[2], 143);
        values.put(Database.COUNTRY[3], "Tajikistan");
        values.put(Database.COUNTRY[4], "Tajikistan");
        values.put(Database.COUNTRY[5], "Tajikistan");
        values.put(Database.COUNTRY[6], "Tajikistan");
        values.put(Database.COUNTRY[7], "Tajikistan");
        db.insert(Database.TABLES[2], null, values);

        // Turkmenistan
        values.put(Database.COUNTRY[1], 762);
        values.put(Database.COUNTRY[2], 143);
        values.put(Database.COUNTRY[3], "Turkmenistan");
        values.put(Database.COUNTRY[4], "Turkmenistan");
        values.put(Database.COUNTRY[5], "Turkmenistan");
        values.put(Database.COUNTRY[6], "Turkmenistan");
        values.put(Database.COUNTRY[7], "Turkmenistan");
        db.insert(Database.TABLES[2], null, values);

        // Uzbekistan
        values.put(Database.COUNTRY[1], 860);
        values.put(Database.COUNTRY[2], 143);
        values.put(Database.COUNTRY[3], "Uzbekistan");
        values.put(Database.COUNTRY[4], "Uzbekistan");
        values.put(Database.COUNTRY[5], "Uzbekistan");
        values.put(Database.COUNTRY[6], "Uzbekistan");
        values.put(Database.COUNTRY[7], "Uzbekistan");
        db.insert(Database.TABLES[2], null, values);

        // China
        values.put(Database.COUNTRY[1], 156);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "China");
        values.put(Database.COUNTRY[4], "China");
        values.put(Database.COUNTRY[5], "China");
        values.put(Database.COUNTRY[6], "China");
        values.put(Database.COUNTRY[7], "China");
        db.insert(Database.TABLES[2], null, values);

        // China, Macao Special Administrative Region
        values.put(Database.COUNTRY[1], 446);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "China, Macao Special Administrative Region");
        values.put(Database.COUNTRY[4], "China, Macao Special Administrative Region");
        values.put(Database.COUNTRY[5], "China, Macao Special Administrative Region");
        values.put(Database.COUNTRY[6], "China, Macao Special Administrative Region");
        values.put(Database.COUNTRY[7], "China, Macao Special Administrative Region");
        db.insert(Database.TABLES[2], null, values);

        // Democratic People's Republic of Korea
        values.put(Database.COUNTRY[1], 408);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "Democratic People's Republic of Korea");
        values.put(Database.COUNTRY[4], "Democratic People's Republic of Korea");
        values.put(Database.COUNTRY[5], "Democratic People's Republic of Korea");
        values.put(Database.COUNTRY[6], "Democratic People's Republic of Korea");
        values.put(Database.COUNTRY[7], "Democratic People's Republic of Korea");
        db.insert(Database.TABLES[2], null, values);

        // Japan
        values.put(Database.COUNTRY[1], 392);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "Japan");
        values.put(Database.COUNTRY[4], "Japan");
        values.put(Database.COUNTRY[5], "Japan");
        values.put(Database.COUNTRY[6], "Japan");
        values.put(Database.COUNTRY[7], "Japan");
        db.insert(Database.TABLES[2], null, values);

        // Mongolia
        values.put(Database.COUNTRY[1], 469);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "Mongolia");
        values.put(Database.COUNTRY[4], "Mongolia");
        values.put(Database.COUNTRY[5], "Mongolia");
        values.put(Database.COUNTRY[6], "Mongolia");
        values.put(Database.COUNTRY[7], "Mongolia");
        db.insert(Database.TABLES[2], null, values);

        // Republic of Korea
        values.put(Database.COUNTRY[1], 410);
        values.put(Database.COUNTRY[2], 30);
        values.put(Database.COUNTRY[3], "Republic of Korea");
        values.put(Database.COUNTRY[4], "Republic of Korea");
        values.put(Database.COUNTRY[5], "Republic of Korea");
        values.put(Database.COUNTRY[6], "Republic of Korea");
        values.put(Database.COUNTRY[7], "Republic of Korea");
        db.insert(Database.TABLES[2], null, values);

        // Afghanistan
        values.put(Database.COUNTRY[1], 4);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Afghanistan");
        values.put(Database.COUNTRY[4], "Afghanistan");
        values.put(Database.COUNTRY[5], "Afghanistan");
        values.put(Database.COUNTRY[6], "Afghanistan");
        values.put(Database.COUNTRY[7], "Afghanistan");
        db.insert(Database.TABLES[2], null, values);

        // Bangladesh
        values.put(Database.COUNTRY[1], 50);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Bangladesh");
        values.put(Database.COUNTRY[4], "Bangladesh");
        values.put(Database.COUNTRY[5], "Bangladesh");
        values.put(Database.COUNTRY[6], "Bangladesh");
        values.put(Database.COUNTRY[7], "Bangladesh");
        db.insert(Database.TABLES[2], null, values);

        // Bhutan
        values.put(Database.COUNTRY[1], 64);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Bhutan");
        values.put(Database.COUNTRY[4], "Bhutan");
        values.put(Database.COUNTRY[5], "Bhutan");
        values.put(Database.COUNTRY[6], "Bhutan");
        values.put(Database.COUNTRY[7], "Bhutan");
        db.insert(Database.TABLES[2], null, values);

        // India
        values.put(Database.COUNTRY[1], 356);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "India");
        values.put(Database.COUNTRY[4], "India");
        values.put(Database.COUNTRY[5], "India");
        values.put(Database.COUNTRY[6], "India");
        values.put(Database.COUNTRY[7], "India");
        db.insert(Database.TABLES[2], null, values);

        // Iran (Islamic Republic of)
        values.put(Database.COUNTRY[1], 364);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Iran (Islamic Republic of)");
        values.put(Database.COUNTRY[4], "Iran (Islamic Republic of)");
        values.put(Database.COUNTRY[5], "Iran (Islamic Republic of)");
        values.put(Database.COUNTRY[6], "Iran (Islamic Republic of)");
        values.put(Database.COUNTRY[7], "Iran (Islamic Republic of)");
        db.insert(Database.TABLES[2], null, values);

        // Maldives
        values.put(Database.COUNTRY[1], 462);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Maldives");
        values.put(Database.COUNTRY[4], "Maldives");
        values.put(Database.COUNTRY[5], "Maldives");
        values.put(Database.COUNTRY[6], "Maldives");
        values.put(Database.COUNTRY[7], "Maldives");
        db.insert(Database.TABLES[2], null, values);

        // Nepal
        values.put(Database.COUNTRY[1], 524);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Nepal");
        values.put(Database.COUNTRY[4], "Nepal");
        values.put(Database.COUNTRY[5], "Nepal");
        values.put(Database.COUNTRY[6], "Nepal");
        values.put(Database.COUNTRY[7], "Nepal");
        db.insert(Database.TABLES[2], null, values);

        // Pakistan
        values.put(Database.COUNTRY[1], 586);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Pakistan");
        values.put(Database.COUNTRY[4], "Pakistan");
        values.put(Database.COUNTRY[5], "Pakistan");
        values.put(Database.COUNTRY[6], "Pakistan");
        values.put(Database.COUNTRY[7], "Pakistan");
        db.insert(Database.TABLES[2], null, values);

        // Sri Lanka
        values.put(Database.COUNTRY[1], 144);
        values.put(Database.COUNTRY[2], 34);
        values.put(Database.COUNTRY[3], "Sri Lanka");
        values.put(Database.COUNTRY[4], "Sri Lanka");
        values.put(Database.COUNTRY[5], "Sri Lanka");
        values.put(Database.COUNTRY[6], "Sri Lanka");
        values.put(Database.COUNTRY[7], "Sri Lanka");
        db.insert(Database.TABLES[2], null, values);

        // Brunei Darussalam
        values.put(Database.COUNTRY[1], 96);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Brunei Darussalam");
        values.put(Database.COUNTRY[4], "Brunei Darussalam");
        values.put(Database.COUNTRY[5], "Brunei Darussalam");
        values.put(Database.COUNTRY[6], "Brunei Darussalam");
        values.put(Database.COUNTRY[7], "Brunei Darussalam");
        db.insert(Database.TABLES[2], null, values);

        // Cambodia
        values.put(Database.COUNTRY[1], 116);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Cambodia");
        values.put(Database.COUNTRY[4], "Cambodia");
        values.put(Database.COUNTRY[5], "Cambodia");
        values.put(Database.COUNTRY[6], "Cambodia");
        values.put(Database.COUNTRY[7], "Cambodia");
        db.insert(Database.TABLES[2], null, values);

        // Indonesia
        values.put(Database.COUNTRY[1], 360);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Indonesia");
        values.put(Database.COUNTRY[4], "Indonesia");
        values.put(Database.COUNTRY[5], "Indonesia");
        values.put(Database.COUNTRY[6], "Indonesia");
        values.put(Database.COUNTRY[7], "Indonesia");
        db.insert(Database.TABLES[2], null, values);

        // Lao People's Democratic Republic
        values.put(Database.COUNTRY[1], 418);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Lao People's Democratic Republic");
        values.put(Database.COUNTRY[4], "Lao People's Democratic Republic");
        values.put(Database.COUNTRY[5], "Lao People's Democratic Republic");
        values.put(Database.COUNTRY[6], "Lao People's Democratic Republic");
        values.put(Database.COUNTRY[7], "Lao People's Democratic Republic");
        db.insert(Database.TABLES[2], null, values);

        // Malaysia
        values.put(Database.COUNTRY[1], 458);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Malaysia");
        values.put(Database.COUNTRY[4], "Malaysia");
        values.put(Database.COUNTRY[5], "Malaysia");
        values.put(Database.COUNTRY[6], "Malaysia");
        values.put(Database.COUNTRY[7], "Malaysia");
        db.insert(Database.TABLES[2], null, values);

        // Myanmar
        values.put(Database.COUNTRY[1], 104);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Myanmar");
        values.put(Database.COUNTRY[4], "Myanmar");
        values.put(Database.COUNTRY[5], "Myanmar");
        values.put(Database.COUNTRY[6], "Myanmar");
        values.put(Database.COUNTRY[7], "Myanmar");
        db.insert(Database.TABLES[2], null, values);

        // Philippines
        values.put(Database.COUNTRY[1], 608);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Philippines");
        values.put(Database.COUNTRY[4], "Philippines");
        values.put(Database.COUNTRY[5], "Philippines");
        values.put(Database.COUNTRY[6], "Philippines");
        values.put(Database.COUNTRY[7], "Philippines");
        db.insert(Database.TABLES[2], null, values);

        // Singapore
        values.put(Database.COUNTRY[1], 702);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Singapore");
        values.put(Database.COUNTRY[4], "Singapore");
        values.put(Database.COUNTRY[5], "Singapore");
        values.put(Database.COUNTRY[6], "Singapore");
        values.put(Database.COUNTRY[7], "Singapore");
        db.insert(Database.TABLES[2], null, values);

        // Thailand
        values.put(Database.COUNTRY[1], 764);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Thailand");
        values.put(Database.COUNTRY[4], "Thailand");
        values.put(Database.COUNTRY[5], "Thailand");
        values.put(Database.COUNTRY[6], "Thailand");
        values.put(Database.COUNTRY[7], "Thailand");
        db.insert(Database.TABLES[2], null, values);

        // Timor-Leste
        values.put(Database.COUNTRY[1], 626);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Timor-Leste");
        values.put(Database.COUNTRY[4], "Timor-Leste");
        values.put(Database.COUNTRY[5], "Timor-Leste");
        values.put(Database.COUNTRY[6], "Timor-Leste");
        values.put(Database.COUNTRY[7], "Timor-Leste");
        db.insert(Database.TABLES[2], null, values);

        // Vietnam
        values.put(Database.COUNTRY[1], 704);
        values.put(Database.COUNTRY[2], 35);
        values.put(Database.COUNTRY[3], "Vietnam");
        values.put(Database.COUNTRY[4], "Vietnam");
        values.put(Database.COUNTRY[5], "Vietnam");
        values.put(Database.COUNTRY[6], "Vietnam");
        values.put(Database.COUNTRY[7], "Vietnam");
        db.insert(Database.TABLES[2], null, values);

        // Armenia
        values.put(Database.COUNTRY[1], 51);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Armenia");
        values.put(Database.COUNTRY[4], "Armenia");
        values.put(Database.COUNTRY[5], "Armenia");
        values.put(Database.COUNTRY[6], "Armenia");
        values.put(Database.COUNTRY[7], "Armenia");
        db.insert(Database.TABLES[2], null, values);

        // Azerbaijan
        values.put(Database.COUNTRY[1], 31);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Azerbaijan");
        values.put(Database.COUNTRY[4], "Azerbaijan");
        values.put(Database.COUNTRY[5], "Azerbaijan");
        values.put(Database.COUNTRY[6], "Azerbaijan");
        values.put(Database.COUNTRY[7], "Azerbaijan");
        db.insert(Database.TABLES[2], null, values);

        // Bahrain
        values.put(Database.COUNTRY[1], 48);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Bahrain");
        values.put(Database.COUNTRY[4], "Bahrain");
        values.put(Database.COUNTRY[5], "Bahrain");
        values.put(Database.COUNTRY[6], "Bahrain");
        values.put(Database.COUNTRY[7], "Bahrain");
        db.insert(Database.TABLES[2], null, values);

        // Cyprus
        values.put(Database.COUNTRY[1], 196);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Cyprus");
        values.put(Database.COUNTRY[4], "Cyprus");
        values.put(Database.COUNTRY[5], "Cyprus");
        values.put(Database.COUNTRY[6], "Cyprus");
        values.put(Database.COUNTRY[7], "Cyprus");
        db.insert(Database.TABLES[2], null, values);

        // Georgia
        values.put(Database.COUNTRY[1], 268);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Georgia");
        values.put(Database.COUNTRY[4], "Georgia");
        values.put(Database.COUNTRY[5], "Georgia");
        values.put(Database.COUNTRY[6], "Georgia");
        values.put(Database.COUNTRY[7], "Georgia");
        db.insert(Database.TABLES[2], null, values);

        // Iraq
        values.put(Database.COUNTRY[1], 368);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Iraq");
        values.put(Database.COUNTRY[4], "Iraq");
        values.put(Database.COUNTRY[5], "Iraq");
        values.put(Database.COUNTRY[6], "Iraq");
        values.put(Database.COUNTRY[7], "Iraq");
        db.insert(Database.TABLES[2], null, values);

        // Israel
        values.put(Database.COUNTRY[1], 368);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Israel");
        values.put(Database.COUNTRY[4], "Israel");
        values.put(Database.COUNTRY[5], "Israel");
        values.put(Database.COUNTRY[6], "Israel");
        values.put(Database.COUNTRY[7], "Israel");
        db.insert(Database.TABLES[2], null, values);

        // Jordan
        values.put(Database.COUNTRY[1], 400);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Jordan");
        values.put(Database.COUNTRY[4], "Jordan");
        values.put(Database.COUNTRY[5], "Jordan");
        values.put(Database.COUNTRY[6], "Jordan");
        values.put(Database.COUNTRY[7], "Jordan");
        db.insert(Database.TABLES[2], null, values);

        // Kuwait
        values.put(Database.COUNTRY[1], 414);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Kuwait");
        values.put(Database.COUNTRY[4], "Kuwait");
        values.put(Database.COUNTRY[5], "Kuwait");
        values.put(Database.COUNTRY[6], "Kuwait");
        values.put(Database.COUNTRY[7], "Kuwait");
        db.insert(Database.TABLES[2], null, values);

        // Lebanon
        values.put(Database.COUNTRY[1], 422);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Lebanon");
        values.put(Database.COUNTRY[4], "Lebanon");
        values.put(Database.COUNTRY[5], "Lebanon");
        values.put(Database.COUNTRY[6], "Lebanon");
        values.put(Database.COUNTRY[7], "Lebanon");
        db.insert(Database.TABLES[2], null, values);

        // Oman
        values.put(Database.COUNTRY[1], 512);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Oman");
        values.put(Database.COUNTRY[4], "Oman");
        values.put(Database.COUNTRY[5], "Oman");
        values.put(Database.COUNTRY[6], "Oman");
        values.put(Database.COUNTRY[7], "Oman");
        db.insert(Database.TABLES[2], null, values);

        // Qatar
        values.put(Database.COUNTRY[1], 634);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Qatar");
        values.put(Database.COUNTRY[4], "Qatar");
        values.put(Database.COUNTRY[5], "Qatar");
        values.put(Database.COUNTRY[6], "Qatar");
        values.put(Database.COUNTRY[7], "Qatar");
        db.insert(Database.TABLES[2], null, values);

        // Saudi Arabia
        values.put(Database.COUNTRY[1], 682);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Saudi Arabia");
        values.put(Database.COUNTRY[4], "Saudi Arabia");
        values.put(Database.COUNTRY[5], "Saudi Arabia");
        values.put(Database.COUNTRY[6], "Saudi Arabia");
        values.put(Database.COUNTRY[7], "Saudi Arabia");
        db.insert(Database.TABLES[2], null, values);

        // State of Palestine
        values.put(Database.COUNTRY[1], 275);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "State of Palestine");
        values.put(Database.COUNTRY[4], "State of Palestine");
        values.put(Database.COUNTRY[5], "State of Palestine");
        values.put(Database.COUNTRY[6], "State of Palestine");
        values.put(Database.COUNTRY[7], "State of Palestine");
        db.insert(Database.TABLES[2], null, values);

        // Syrian Arab Republic
        values.put(Database.COUNTRY[1], 760);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Syrian Arab Republic");
        values.put(Database.COUNTRY[4], "Syrian Arab Republic");
        values.put(Database.COUNTRY[5], "Syrian Arab Republic");
        values.put(Database.COUNTRY[6], "Syrian Arab Republic");
        values.put(Database.COUNTRY[7], "Syrian Arab Republic");
        db.insert(Database.TABLES[2], null, values);

        // Turkey
        values.put(Database.COUNTRY[1], 792);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Turkey");
        values.put(Database.COUNTRY[4], "Turkey");
        values.put(Database.COUNTRY[5], "Turkey");
        values.put(Database.COUNTRY[6], "Turkey");
        values.put(Database.COUNTRY[7], "Turkey");
        db.insert(Database.TABLES[2], null, values);

        // United Arab Emirates
        values.put(Database.COUNTRY[1], 784);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "United Arab Emirates");
        values.put(Database.COUNTRY[4], "United Arab Emirates");
        values.put(Database.COUNTRY[5], "United Arab Emirates");
        values.put(Database.COUNTRY[6], "United Arab Emirates");
        values.put(Database.COUNTRY[7], "United Arab Emirates");
        db.insert(Database.TABLES[2], null, values);

        // Yemen
        values.put(Database.COUNTRY[1], 887);
        values.put(Database.COUNTRY[2], 145);
        values.put(Database.COUNTRY[3], "Yemen");
        values.put(Database.COUNTRY[4], "Yemen");
        values.put(Database.COUNTRY[5], "Yemen");
        values.put(Database.COUNTRY[6], "Yemen");
        values.put(Database.COUNTRY[7], "Yemen");
        db.insert(Database.TABLES[2], null, values);

        // Belarus
        values.put(Database.COUNTRY[1], 112);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Belarus");
        values.put(Database.COUNTRY[4], "Belarus");
        values.put(Database.COUNTRY[5], "Belarus");
        values.put(Database.COUNTRY[6], "Belarus");
        values.put(Database.COUNTRY[7], "Belarus");
        db.insert(Database.TABLES[2], null, values);

        // Bulgaria
        values.put(Database.COUNTRY[1], 100);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Bulgaria");
        values.put(Database.COUNTRY[4], "Bulgaria");
        values.put(Database.COUNTRY[5], "Bulgaria");
        values.put(Database.COUNTRY[6], "Bulgaria");
        values.put(Database.COUNTRY[7], "Bulgaria");
        db.insert(Database.TABLES[2], null, values);

        // Czech Republic
        values.put(Database.COUNTRY[1], 203);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Czech Republic");
        values.put(Database.COUNTRY[4], "Czech Republic");
        values.put(Database.COUNTRY[5], "Czech Republic");
        values.put(Database.COUNTRY[6], "Czech Republic");
        values.put(Database.COUNTRY[7], "Czech Republic");
        db.insert(Database.TABLES[2], null, values);

        // Hungary
        values.put(Database.COUNTRY[1], 348);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Hungary");
        values.put(Database.COUNTRY[4], "Hungary");
        values.put(Database.COUNTRY[5], "Hungary");
        values.put(Database.COUNTRY[6], "Hungary");
        values.put(Database.COUNTRY[7], "Hungary");
        db.insert(Database.TABLES[2], null, values);

        // Poland
        values.put(Database.COUNTRY[1], 616);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Poland");
        values.put(Database.COUNTRY[4], "Poland");
        values.put(Database.COUNTRY[5], "Poland");
        values.put(Database.COUNTRY[6], "Poland");
        values.put(Database.COUNTRY[7], "Poland");
        db.insert(Database.TABLES[2], null, values);

        // Republic of Moldova
        values.put(Database.COUNTRY[1], 498);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Republic of Moldova");
        values.put(Database.COUNTRY[4], "Republic of Moldova");
        values.put(Database.COUNTRY[5], "Republic of Moldova");
        values.put(Database.COUNTRY[6], "Republic of Moldova");
        values.put(Database.COUNTRY[7], "Republic of Moldova");
        db.insert(Database.TABLES[2], null, values);

        // Romania
        values.put(Database.COUNTRY[1], 642);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Romania");
        values.put(Database.COUNTRY[4], "Romania");
        values.put(Database.COUNTRY[5], "Romania");
        values.put(Database.COUNTRY[6], "Romania");
        values.put(Database.COUNTRY[7], "Romania");
        db.insert(Database.TABLES[2], null, values);

        // Russian Federation
        values.put(Database.COUNTRY[1], 643);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Russian Federation");
        values.put(Database.COUNTRY[4], "Russian Federation");
        values.put(Database.COUNTRY[5], "Russian Federation");
        values.put(Database.COUNTRY[6], "Russian Federation");
        values.put(Database.COUNTRY[7], "Russian Federation");
        db.insert(Database.TABLES[2], null, values);

        // Slovakia
        values.put(Database.COUNTRY[1], 703);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Slovakia");
        values.put(Database.COUNTRY[4], "Slovakia");
        values.put(Database.COUNTRY[5], "Slovakia");
        values.put(Database.COUNTRY[6], "Slovakia");
        values.put(Database.COUNTRY[7], "Slovakia");
        db.insert(Database.TABLES[2], null, values);

        // Ukraine
        values.put(Database.COUNTRY[1], 804);
        values.put(Database.COUNTRY[2], 151);
        values.put(Database.COUNTRY[3], "Ukraine");
        values.put(Database.COUNTRY[4], "Ukraine");
        values.put(Database.COUNTRY[5], "Ukraine");
        values.put(Database.COUNTRY[6], "Ukraine");
        values.put(Database.COUNTRY[7], "Ukraine");
        db.insert(Database.TABLES[2], null, values);

        // Åland Islands
        values.put(Database.COUNTRY[1], 248);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Åland Islands");
        values.put(Database.COUNTRY[4], "Åland Islands");
        values.put(Database.COUNTRY[5], "Åland Islands");
        values.put(Database.COUNTRY[6], "Åland Islands");
        values.put(Database.COUNTRY[7], "Åland Islands");
        db.insert(Database.TABLES[2], null, values);

        // Channel Islands
        values.put(Database.COUNTRY[1], 830);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Channel Islands");
        values.put(Database.COUNTRY[4], "Channel Islands");
        values.put(Database.COUNTRY[5], "Channel Islands");
        values.put(Database.COUNTRY[6], "Channel Islands");
        values.put(Database.COUNTRY[7], "Channel Islands");
        db.insert(Database.TABLES[2], null, values);

        // Denmark
        values.put(Database.COUNTRY[1], 208);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Denmark");
        values.put(Database.COUNTRY[4], "Denmark");
        values.put(Database.COUNTRY[5], "Denmark");
        values.put(Database.COUNTRY[6], "Denmark");
        values.put(Database.COUNTRY[7], "Denmark");
        db.insert(Database.TABLES[2], null, values);

        // Estonia
        values.put(Database.COUNTRY[1], 233);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Estonia");
        values.put(Database.COUNTRY[4], "Estonia");
        values.put(Database.COUNTRY[5], "Estonia");
        values.put(Database.COUNTRY[6], "Estonia");
        values.put(Database.COUNTRY[7], "Estonia");
        db.insert(Database.TABLES[2], null, values);

        // Faeroe Islands
        values.put(Database.COUNTRY[1], 234);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Faeroe Islands");
        values.put(Database.COUNTRY[4], "Faeroe Islands");
        values.put(Database.COUNTRY[5], "Faeroe Islands");
        values.put(Database.COUNTRY[6], "Faeroe Islands");
        values.put(Database.COUNTRY[7], "Faeroe Islands");
        db.insert(Database.TABLES[2], null, values);

        // Finland
        values.put(Database.COUNTRY[1], 246);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Finland");
        values.put(Database.COUNTRY[4], "Finland");
        values.put(Database.COUNTRY[5], "Finland");
        values.put(Database.COUNTRY[6], "Finland");
        values.put(Database.COUNTRY[7], "Finland");
        db.insert(Database.TABLES[2], null, values);

        // Guernsey
        values.put(Database.COUNTRY[1], 831);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Guernsey");
        values.put(Database.COUNTRY[4], "Guernsey");
        values.put(Database.COUNTRY[5], "Guernsey");
        values.put(Database.COUNTRY[6], "Guernsey");
        values.put(Database.COUNTRY[7], "Guernsey");
        db.insert(Database.TABLES[2], null, values);

        // Iceland
        values.put(Database.COUNTRY[1], 352);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Iceland");
        values.put(Database.COUNTRY[4], "Iceland");
        values.put(Database.COUNTRY[5], "Iceland");
        values.put(Database.COUNTRY[6], "Iceland");
        values.put(Database.COUNTRY[7], "Iceland");
        db.insert(Database.TABLES[2], null, values);

        // Ireland
        values.put(Database.COUNTRY[1], 372);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Ireland");
        values.put(Database.COUNTRY[4], "Ireland");
        values.put(Database.COUNTRY[5], "Ireland");
        values.put(Database.COUNTRY[6], "Ireland");
        values.put(Database.COUNTRY[7], "Ireland");
        db.insert(Database.TABLES[2], null, values);

        // Isle of Man
        values.put(Database.COUNTRY[1], 833);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Isle of Man");
        values.put(Database.COUNTRY[4], "Isle of Man");
        values.put(Database.COUNTRY[5], "Isle of Man");
        values.put(Database.COUNTRY[6], "Isle of Man");
        values.put(Database.COUNTRY[7], "Isle of Man");
        db.insert(Database.TABLES[2], null, values);

        // Jersey
        values.put(Database.COUNTRY[1], 832);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Jersey");
        values.put(Database.COUNTRY[4], "Jersey");
        values.put(Database.COUNTRY[5], "Jersey");
        values.put(Database.COUNTRY[6], "Jersey");
        values.put(Database.COUNTRY[7], "Jersey");
        db.insert(Database.TABLES[2], null, values);

        // Latvia
        values.put(Database.COUNTRY[1], 428);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Latvia");
        values.put(Database.COUNTRY[4], "Latvia");
        values.put(Database.COUNTRY[5], "Latvia");
        values.put(Database.COUNTRY[6], "Latvia");
        values.put(Database.COUNTRY[7], "Latvia");
        db.insert(Database.TABLES[2], null, values);

        // Lithuania
        values.put(Database.COUNTRY[1], 440);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Lithuania");
        values.put(Database.COUNTRY[4], "Lithuania");
        values.put(Database.COUNTRY[5], "Lithuania");
        values.put(Database.COUNTRY[6], "Lithuania");
        values.put(Database.COUNTRY[7], "Lithuania");
        db.insert(Database.TABLES[2], null, values);

        // Norway
        values.put(Database.COUNTRY[1], 578);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Norway");
        values.put(Database.COUNTRY[4], "Norway");
        values.put(Database.COUNTRY[5], "Norway");
        values.put(Database.COUNTRY[6], "Norway");
        values.put(Database.COUNTRY[7], "Norway");
        db.insert(Database.TABLES[2], null, values);

        // Sark
        values.put(Database.COUNTRY[1], 680);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Sark");
        values.put(Database.COUNTRY[4], "Sark");
        values.put(Database.COUNTRY[5], "Sark");
        values.put(Database.COUNTRY[6], "Sark");
        values.put(Database.COUNTRY[7], "Sark");
        db.insert(Database.TABLES[2], null, values);

        // Svalbard and Jan Mayen Islands
        values.put(Database.COUNTRY[1], 744);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Svalbard and Jan Mayen Islands");
        values.put(Database.COUNTRY[4], "Svalbard and Jan Mayen Islands");
        values.put(Database.COUNTRY[5], "Svalbard and Jan Mayen Islands");
        values.put(Database.COUNTRY[6], "Svalbard and Jan Mayen Islands");
        values.put(Database.COUNTRY[7], "Svalbard and Jan Mayen Islands");
        db.insert(Database.TABLES[2], null, values);

        // Sweden
        values.put(Database.COUNTRY[1], 752);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "Sweden");
        values.put(Database.COUNTRY[4], "Sweden");
        values.put(Database.COUNTRY[5], "Sweden");
        values.put(Database.COUNTRY[6], "Sweden");
        values.put(Database.COUNTRY[7], "Sweden");
        db.insert(Database.TABLES[2], null, values);

        // United Kingdom of Great Britain
        values.put(Database.COUNTRY[1], 826);
        values.put(Database.COUNTRY[2], 154);
        values.put(Database.COUNTRY[3], "United Kingdom of Great Britain");
        values.put(Database.COUNTRY[4], "United Kingdom of Great Britain");
        values.put(Database.COUNTRY[5], "United Kingdom of Great Britain");
        values.put(Database.COUNTRY[6], "United Kingdom of Great Britain");
        values.put(Database.COUNTRY[7], "United Kingdom of Great Britain");
        db.insert(Database.TABLES[2], null, values);

        // Albania
        values.put(Database.COUNTRY[1], 8);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Albania");
        values.put(Database.COUNTRY[4], "Albania");
        values.put(Database.COUNTRY[5], "Albania");
        values.put(Database.COUNTRY[6], "Albania");
        values.put(Database.COUNTRY[7], "Albania");
        db.insert(Database.TABLES[2], null, values);

        // Andorra
        values.put(Database.COUNTRY[1], 20);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Andorra");
        values.put(Database.COUNTRY[4], "Andorra");
        values.put(Database.COUNTRY[5], "Andorra");
        values.put(Database.COUNTRY[6], "Andorra");
        values.put(Database.COUNTRY[7], "Andorra");
        db.insert(Database.TABLES[2], null, values);

        // Bosnia and Herzegovina
        values.put(Database.COUNTRY[1], 70);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Bosnia and Herzegovina");
        values.put(Database.COUNTRY[4], "Bosnia and Herzegovina");
        values.put(Database.COUNTRY[5], "Bosnia and Herzegovina");
        values.put(Database.COUNTRY[6], "Bosnia and Herzegovina");
        values.put(Database.COUNTRY[7], "Bosnia and Herzegovina");
        db.insert(Database.TABLES[2], null, values);

        // Croatia
        values.put(Database.COUNTRY[1], 191);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Croatia");
        values.put(Database.COUNTRY[4], "Croatia");
        values.put(Database.COUNTRY[5], "Croatia");
        values.put(Database.COUNTRY[6], "Croatia");
        values.put(Database.COUNTRY[7], "Croatia");
        db.insert(Database.TABLES[2], null, values);

        // Gibraltar
        values.put(Database.COUNTRY[1], 292);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Gibraltar");
        values.put(Database.COUNTRY[4], "Gibraltar");
        values.put(Database.COUNTRY[5], "Gibraltar");
        values.put(Database.COUNTRY[6], "Gibraltar");
        values.put(Database.COUNTRY[7], "Gibraltar");
        db.insert(Database.TABLES[2], null, values);

        // Greece
        values.put(Database.COUNTRY[1], 300);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Greece");
        values.put(Database.COUNTRY[4], "Greece");
        values.put(Database.COUNTRY[5], "Greece");
        values.put(Database.COUNTRY[6], "Greece");
        values.put(Database.COUNTRY[7], "Greece");
        db.insert(Database.TABLES[2], null, values);

        // Holy See
        values.put(Database.COUNTRY[1], 336);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Holy See");
        values.put(Database.COUNTRY[4], "Holy See");
        values.put(Database.COUNTRY[5], "Holy See");
        values.put(Database.COUNTRY[6], "Holy See");
        values.put(Database.COUNTRY[7], "Holy See");
        db.insert(Database.TABLES[2], null, values);

        // Italy
        values.put(Database.COUNTRY[1], 380);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Italy");
        values.put(Database.COUNTRY[4], "Italy");
        values.put(Database.COUNTRY[5], "Italy");
        values.put(Database.COUNTRY[6], "Italy");
        values.put(Database.COUNTRY[7], "Italy");
        db.insert(Database.TABLES[2], null, values);

        // Malta
        values.put(Database.COUNTRY[1], 470);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Malta");
        values.put(Database.COUNTRY[4], "Malta");
        values.put(Database.COUNTRY[5], "Malta");
        values.put(Database.COUNTRY[6], "Malta");
        values.put(Database.COUNTRY[7], "Malta");
        db.insert(Database.TABLES[2], null, values);

        // Montenegro
        values.put(Database.COUNTRY[1], 499);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Montenegro");
        values.put(Database.COUNTRY[4], "Montenegro");
        values.put(Database.COUNTRY[5], "Montenegro");
        values.put(Database.COUNTRY[6], "Montenegro");
        values.put(Database.COUNTRY[7], "Montenegro");
        db.insert(Database.TABLES[2], null, values);

        // Portugal
        values.put(Database.COUNTRY[1], 620);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Portugal");
        values.put(Database.COUNTRY[4], "Portugal");
        values.put(Database.COUNTRY[5], "Portugal");
        values.put(Database.COUNTRY[6], "Portugal");
        values.put(Database.COUNTRY[7], "Portugal");
        db.insert(Database.TABLES[2], null, values);

        // San Marino
        values.put(Database.COUNTRY[1], 674);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "San Marino");
        values.put(Database.COUNTRY[4], "San Marino");
        values.put(Database.COUNTRY[5], "San Marino");
        values.put(Database.COUNTRY[6], "San Marino");
        values.put(Database.COUNTRY[7], "San Marino");
        db.insert(Database.TABLES[2], null, values);

        // Serbia
        values.put(Database.COUNTRY[1], 688);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Serbia");
        values.put(Database.COUNTRY[4], "Serbia");
        values.put(Database.COUNTRY[5], "Serbia");
        values.put(Database.COUNTRY[6], "Serbia");
        values.put(Database.COUNTRY[7], "Serbia");
        db.insert(Database.TABLES[2], null, values);

        // Slovenia
        values.put(Database.COUNTRY[1], 705);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Slovenia");
        values.put(Database.COUNTRY[4], "Slovenia");
        values.put(Database.COUNTRY[5], "Slovenia");
        values.put(Database.COUNTRY[6], "Slovenia");
        values.put(Database.COUNTRY[7], "Slovenia");
        db.insert(Database.TABLES[2], null, values);

        // Spain
        values.put(Database.COUNTRY[1], 724);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Spain");
        values.put(Database.COUNTRY[4], "Spain");
        values.put(Database.COUNTRY[5], "Spain");
        values.put(Database.COUNTRY[6], "Spain");
        values.put(Database.COUNTRY[7], "Spain");
        db.insert(Database.TABLES[2], null, values);

        // Republic of Macedonia
        values.put(Database.COUNTRY[1], 807);
        values.put(Database.COUNTRY[2], 39);
        values.put(Database.COUNTRY[3], "Republic of Macedonia");
        values.put(Database.COUNTRY[4], "Republic of Macedonia");
        values.put(Database.COUNTRY[5], "Republic of Macedonia");
        values.put(Database.COUNTRY[6], "Republic of Macedonia");
        values.put(Database.COUNTRY[7], "Republic of Macedonia");
        db.insert(Database.TABLES[2], null, values);

        // Austria
        values.put(Database.COUNTRY[1], 40);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Austria");
        values.put(Database.COUNTRY[4], "Austria");
        values.put(Database.COUNTRY[5], "Austria");
        values.put(Database.COUNTRY[6], "Austria");
        values.put(Database.COUNTRY[7], "Austria");
        db.insert(Database.TABLES[2], null, values);

        // Belgium
        values.put(Database.COUNTRY[1], 56);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Belgium");
        values.put(Database.COUNTRY[4], "Belgium");
        values.put(Database.COUNTRY[5], "Belgium");
        values.put(Database.COUNTRY[6], "Belgium");
        values.put(Database.COUNTRY[7], "Belgium");
        db.insert(Database.TABLES[2], null, values);

        // France
        values.put(Database.COUNTRY[1], 250);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "France");
        values.put(Database.COUNTRY[4], "France");
        values.put(Database.COUNTRY[5], "France");
        values.put(Database.COUNTRY[6], "France");
        values.put(Database.COUNTRY[7], "France");
        db.insert(Database.TABLES[2], null, values);

        // France
        values.put(Database.COUNTRY[1], 250);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "France");
        values.put(Database.COUNTRY[4], "France");
        values.put(Database.COUNTRY[5], "France");
        values.put(Database.COUNTRY[6], "France");
        values.put(Database.COUNTRY[7], "France");
        db.insert(Database.TABLES[2], null, values);

        // Germany
        values.put(Database.COUNTRY[1], 276);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Germany");
        values.put(Database.COUNTRY[4], "Germany");
        values.put(Database.COUNTRY[5], "Germany");
        values.put(Database.COUNTRY[6], "Germany");
        values.put(Database.COUNTRY[7], "Germany");
        db.insert(Database.TABLES[2], null, values);

        // Liechtenstein
        values.put(Database.COUNTRY[1], 438);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Liechtenstein");
        values.put(Database.COUNTRY[4], "Liechtenstein");
        values.put(Database.COUNTRY[5], "Liechtenstein");
        values.put(Database.COUNTRY[6], "Liechtenstein");
        values.put(Database.COUNTRY[7], "Liechtenstein");
        db.insert(Database.TABLES[2], null, values);

        // Luxembourg
        values.put(Database.COUNTRY[1], 442);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Luxembourg");
        values.put(Database.COUNTRY[4], "Luxembourg");
        values.put(Database.COUNTRY[5], "Luxembourg");
        values.put(Database.COUNTRY[6], "Luxembourg");
        values.put(Database.COUNTRY[7], "Luxembourg");
        db.insert(Database.TABLES[2], null, values);

        // Monaco
        values.put(Database.COUNTRY[1], 492);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Monaco");
        values.put(Database.COUNTRY[4], "Monaco");
        values.put(Database.COUNTRY[5], "Monaco");
        values.put(Database.COUNTRY[6], "Monaco");
        values.put(Database.COUNTRY[7], "Monaco");
        db.insert(Database.TABLES[2], null, values);

        // Netherlands
        values.put(Database.COUNTRY[1], 528);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Netherlands");
        values.put(Database.COUNTRY[4], "Netherlands");
        values.put(Database.COUNTRY[5], "Netherlands");
        values.put(Database.COUNTRY[6], "Netherlands");
        values.put(Database.COUNTRY[7], "Netherlands");
        db.insert(Database.TABLES[2], null, values);

        // Switzerland
        values.put(Database.COUNTRY[1], 756);
        values.put(Database.COUNTRY[2], 155);
        values.put(Database.COUNTRY[3], "Switzerland");
        values.put(Database.COUNTRY[4], "Switzerland");
        values.put(Database.COUNTRY[5], "Switzerland");
        values.put(Database.COUNTRY[6], "Switzerland");
        values.put(Database.COUNTRY[7], "Switzerland");
        db.insert(Database.TABLES[2], null, values);

        // Australia
        values.put(Database.COUNTRY[1], 36);
        values.put(Database.COUNTRY[2], 53);
        values.put(Database.COUNTRY[3], "Australia");
        values.put(Database.COUNTRY[4], "Australia");
        values.put(Database.COUNTRY[5], "Australia");
        values.put(Database.COUNTRY[6], "Australia");
        values.put(Database.COUNTRY[7], "Australia");
        db.insert(Database.TABLES[2], null, values);

        // New Zealand
        values.put(Database.COUNTRY[1], 554);
        values.put(Database.COUNTRY[2], 53);
        values.put(Database.COUNTRY[3], "New Zealand");
        values.put(Database.COUNTRY[4], "New Zealand");
        values.put(Database.COUNTRY[5], "New Zealand");
        values.put(Database.COUNTRY[6], "New Zealand");
        values.put(Database.COUNTRY[7], "New Zealand");
        db.insert(Database.TABLES[2], null, values);

        // Norfolk Island
        values.put(Database.COUNTRY[1], 574);
        values.put(Database.COUNTRY[2], 53);
        values.put(Database.COUNTRY[3], "Norfolk Island");
        values.put(Database.COUNTRY[4], "Norfolk Island");
        values.put(Database.COUNTRY[5], "Norfolk Island");
        values.put(Database.COUNTRY[6], "Norfolk Island");
        values.put(Database.COUNTRY[7], "Norfolk Island");
        db.insert(Database.TABLES[2], null, values);

        // Fiji
        values.put(Database.COUNTRY[1], 242);
        values.put(Database.COUNTRY[2], 54);
        values.put(Database.COUNTRY[3], "Fiji");
        values.put(Database.COUNTRY[4], "Fiji");
        values.put(Database.COUNTRY[5], "Fiji");
        values.put(Database.COUNTRY[6], "Fiji");
        values.put(Database.COUNTRY[7], "Fiji");
        db.insert(Database.TABLES[2], null, values);

        // New Caledonia
        values.put(Database.COUNTRY[1], 540);
        values.put(Database.COUNTRY[2], 54);
        values.put(Database.COUNTRY[3], "New Caledonia");
        values.put(Database.COUNTRY[4], "New Caledonia");
        values.put(Database.COUNTRY[5], "New Caledonia");
        values.put(Database.COUNTRY[6], "New Caledonia");
        values.put(Database.COUNTRY[7], "New Caledonia");
        db.insert(Database.TABLES[2], null, values);

        // Papua New Guinea
        values.put(Database.COUNTRY[1], 598);
        values.put(Database.COUNTRY[2], 54);
        values.put(Database.COUNTRY[3], "Papua New Guinea");
        values.put(Database.COUNTRY[4], "Papua New Guinea");
        values.put(Database.COUNTRY[5], "Papua New Guinea");
        values.put(Database.COUNTRY[6], "Papua New Guinea");
        values.put(Database.COUNTRY[7], "Papua New Guinea");
        db.insert(Database.TABLES[2], null, values);

        // Solomon Islands
        values.put(Database.COUNTRY[1], 90);
        values.put(Database.COUNTRY[2], 54);
        values.put(Database.COUNTRY[3], "Solomon Islands");
        values.put(Database.COUNTRY[4], "Solomon Islands");
        values.put(Database.COUNTRY[5], "Solomon Islands");
        values.put(Database.COUNTRY[6], "Solomon Islands");
        values.put(Database.COUNTRY[7], "Solomon Islands");
        db.insert(Database.TABLES[2], null, values);

        // Vanuatu
        values.put(Database.COUNTRY[1], 548);
        values.put(Database.COUNTRY[2], 54);
        values.put(Database.COUNTRY[3], "Vanuatu");
        values.put(Database.COUNTRY[4], "Vanuatu");
        values.put(Database.COUNTRY[5], "Vanuatu");
        values.put(Database.COUNTRY[6], "Vanuatu");
        values.put(Database.COUNTRY[7], "Vanuatu");
        db.insert(Database.TABLES[2], null, values);

        // Guam
        values.put(Database.COUNTRY[1], 316);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Guam");
        values.put(Database.COUNTRY[4], "Guam");
        values.put(Database.COUNTRY[5], "Guam");
        values.put(Database.COUNTRY[6], "Guam");
        values.put(Database.COUNTRY[7], "Guam");
        db.insert(Database.TABLES[2], null, values);

        // Kiribati
        values.put(Database.COUNTRY[1], 296);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Kiribati");
        values.put(Database.COUNTRY[4], "Kiribati");
        values.put(Database.COUNTRY[5], "Kiribati");
        values.put(Database.COUNTRY[6], "Kiribati");
        values.put(Database.COUNTRY[7], "Kiribati");
        db.insert(Database.TABLES[2], null, values);

        // Kiribati
        values.put(Database.COUNTRY[1], 296);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Kiribati");
        values.put(Database.COUNTRY[4], "Kiribati");
        values.put(Database.COUNTRY[5], "Kiribati");
        values.put(Database.COUNTRY[6], "Kiribati");
        values.put(Database.COUNTRY[7], "Kiribati");
        db.insert(Database.TABLES[2], null, values);

        // Marshall Islands
        values.put(Database.COUNTRY[1], 584);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Marshall Islands");
        values.put(Database.COUNTRY[4], "Marshall Islands");
        values.put(Database.COUNTRY[5], "Marshall Islands");
        values.put(Database.COUNTRY[6], "Marshall Islands");
        values.put(Database.COUNTRY[7], "Marshall Islands");
        db.insert(Database.TABLES[2], null, values);

        // Micronesia (Federated States of)
        values.put(Database.COUNTRY[1], 583);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Micronesia (Federated States of)");
        values.put(Database.COUNTRY[4], "Micronesia (Federated States of)");
        values.put(Database.COUNTRY[5], "Micronesia (Federated States of)");
        values.put(Database.COUNTRY[6], "Micronesia (Federated States of)");
        values.put(Database.COUNTRY[7], "Micronesia (Federated States of)");
        db.insert(Database.TABLES[2], null, values);

        // Nauru
        values.put(Database.COUNTRY[1], 520);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Nauru");
        values.put(Database.COUNTRY[4], "Nauru");
        values.put(Database.COUNTRY[5], "Nauru");
        values.put(Database.COUNTRY[6], "Nauru");
        values.put(Database.COUNTRY[7], "Nauru");
        db.insert(Database.TABLES[2], null, values);

        // Northern Mariana Islands
        values.put(Database.COUNTRY[1], 580);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Northern Mariana Islands");
        values.put(Database.COUNTRY[4], "Northern Mariana Islands");
        values.put(Database.COUNTRY[5], "Northern Mariana Islands");
        values.put(Database.COUNTRY[6], "Northern Mariana Islands");
        values.put(Database.COUNTRY[7], "Northern Mariana Islands");
        db.insert(Database.TABLES[2], null, values);

        // Palau
        values.put(Database.COUNTRY[1], 585);
        values.put(Database.COUNTRY[2], 57);
        values.put(Database.COUNTRY[3], "Palau");
        values.put(Database.COUNTRY[4], "Palau");
        values.put(Database.COUNTRY[5], "Palau");
        values.put(Database.COUNTRY[6], "Palau");
        values.put(Database.COUNTRY[7], "Palau");
        db.insert(Database.TABLES[2], null, values);

        // American Samoa
        values.put(Database.COUNTRY[1], 16);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "American Samoa");
        values.put(Database.COUNTRY[4], "American Samoa");
        values.put(Database.COUNTRY[5], "American Samoa");
        values.put(Database.COUNTRY[6], "American Samoa");
        values.put(Database.COUNTRY[7], "American Samoa");
        db.insert(Database.TABLES[2], null, values);

        // American Samoa
        values.put(Database.COUNTRY[1], 184);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Cook Islands");
        values.put(Database.COUNTRY[4], "Cook Islands");
        values.put(Database.COUNTRY[5], "Cook Islands");
        values.put(Database.COUNTRY[6], "Cook Islands");
        values.put(Database.COUNTRY[7], "Cook Islands");
        db.insert(Database.TABLES[2], null, values);

        // French Polynesia
        values.put(Database.COUNTRY[1], 258);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "French Polynesia");
        values.put(Database.COUNTRY[4], "French Polynesia");
        values.put(Database.COUNTRY[5], "French Polynesia");
        values.put(Database.COUNTRY[6], "French Polynesia");
        values.put(Database.COUNTRY[7], "French Polynesia");
        db.insert(Database.TABLES[2], null, values);

        // Niue
        values.put(Database.COUNTRY[1], 570);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Niue");
        values.put(Database.COUNTRY[4], "Niue");
        values.put(Database.COUNTRY[5], "Niue");
        values.put(Database.COUNTRY[6], "Niue");
        values.put(Database.COUNTRY[7], "Niue");
        db.insert(Database.TABLES[2], null, values);

        // Pitcairn
        values.put(Database.COUNTRY[1], 612);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Pitcairn");
        values.put(Database.COUNTRY[4], "Pitcairn");
        values.put(Database.COUNTRY[5], "Pitcairn");
        values.put(Database.COUNTRY[6], "Pitcairn");
        values.put(Database.COUNTRY[7], "Pitcairn");
        db.insert(Database.TABLES[2], null, values);

        // Samoa
        values.put(Database.COUNTRY[1], 882);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Samoa");
        values.put(Database.COUNTRY[4], "Samoa");
        values.put(Database.COUNTRY[5], "Samoa");
        values.put(Database.COUNTRY[6], "Samoa");
        values.put(Database.COUNTRY[7], "Samoa");
        db.insert(Database.TABLES[2], null, values);

        // Tokelau
        values.put(Database.COUNTRY[1], 772);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Tokelau");
        values.put(Database.COUNTRY[4], "Tokelau");
        values.put(Database.COUNTRY[5], "Tokelau");
        values.put(Database.COUNTRY[6], "Tokelau");
        values.put(Database.COUNTRY[7], "Tokelau");
        db.insert(Database.TABLES[2], null, values);

        // Tonga
        values.put(Database.COUNTRY[1], 776);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Tonga");
        values.put(Database.COUNTRY[4], "Tonga");
        values.put(Database.COUNTRY[5], "Tonga");
        values.put(Database.COUNTRY[6], "Tonga");
        values.put(Database.COUNTRY[7], "Tonga");
        db.insert(Database.TABLES[2], null, values);

        // Tuvalu
        values.put(Database.COUNTRY[1], 798);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Tuvalu");
        values.put(Database.COUNTRY[4], "Tuvalu");
        values.put(Database.COUNTRY[5], "Tuvalu");
        values.put(Database.COUNTRY[6], "Tuvalu");
        values.put(Database.COUNTRY[7], "Tuvalu");
        db.insert(Database.TABLES[2], null, values);

        // Wallis and Futuna Islands
        values.put(Database.COUNTRY[1], 876);
        values.put(Database.COUNTRY[2], 61);
        values.put(Database.COUNTRY[3], "Wallis and Futuna Islands");
        values.put(Database.COUNTRY[4], "Wallis and Futuna Islands");
        values.put(Database.COUNTRY[5], "Wallis and Futuna Islands");
        values.put(Database.COUNTRY[6], "Wallis and Futuna Islands");
        values.put(Database.COUNTRY[7], "Wallis and Futuna Islands");
        db.insert(Database.TABLES[2], null, values);
    }

    // Insert default data for Type
    public static void InsertType(SQLiteDatabase db) {
        values.clear();

        // Pale lager
        values.put(Database.TYPE[1], 1);
        values.put(Database.TYPE[2], "Pale lager");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Pale lager.");

        // Witbier
        values.put(Database.TYPE[1], 2);
        values.put(Database.TYPE[2], "Witbier");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Witbier.");

        // Pilsener
        values.put(Database.TYPE[1], 3);
        values.put(Database.TYPE[2], "Pilsener");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Pilsener.");

        // Berliner Weisse
        values.put(Database.TYPE[1], 4);
        values.put(Database.TYPE[2], "Berliner Weisse");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Berliner Weisse.");

        // Maibock
        values.put(Database.TYPE[1], 5);
        values.put(Database.TYPE[2], "Maibock");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Maibock.");

        // Blonde Ale
        values.put(Database.TYPE[1], 6);
        values.put(Database.TYPE[2], "Blonde Ale");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Blonde Ale.");

        // Weissbier
        values.put(Database.TYPE[1], 7);
        values.put(Database.TYPE[2], "Weissbier");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Weissbier.");

        // American Pale Ale
        values.put(Database.TYPE[1], 8);
        values.put(Database.TYPE[2], "American Pale Ale");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting American Pale Ale.");

        // India Pale Ale
        values.put(Database.TYPE[1], 9);
        values.put(Database.TYPE[2], "India Pale Ale");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting India Pale Ale.");

        // Saison
        values.put(Database.TYPE[1], 11);
        values.put(Database.TYPE[2], "Saison");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Saison.");

        // English Bitter
        values.put(Database.TYPE[1], 12);
        values.put(Database.TYPE[2], "English Bitter");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting English Bitter.");

        // ESB
        values.put(Database.TYPE[1], 13);
        values.put(Database.TYPE[2], "ESB");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting ESB.");

        // Biere de Garde
        values.put(Database.TYPE[1], 14);
        values.put(Database.TYPE[2], "Biere de Garde");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Biere de Garde.");

        // Double IPA
        values.put(Database.TYPE[1], 15);
        values.put(Database.TYPE[2], "Double IPA");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Double IPA.");

        // Dark lager
        values.put(Database.TYPE[1], 16);
        values.put(Database.TYPE[2], "Dark lager");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Dark lager.");

        // Vienna lager
        values.put(Database.TYPE[1], 17);
        values.put(Database.TYPE[2], "Vienna lager");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Vienna lager.");

        // Marzen
        values.put(Database.TYPE[1], 18);
        values.put(Database.TYPE[2], "Marzen");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Marzen.");

        // Amber Ale
        values.put(Database.TYPE[1], 19);
        values.put(Database.TYPE[2], "Amber Ale");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Amber Ale.");

        // Brown Ale
        values.put(Database.TYPE[1], 20);
        values.put(Database.TYPE[2], "Brown Ale");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Brown Ale.");

        // Bock
        values.put(Database.TYPE[1], 21);
        values.put(Database.TYPE[2], "Bock");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Bock.");

        // Dunkel
        values.put(Database.TYPE[1], 22);
        values.put(Database.TYPE[2], "Dunkel");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Dunkel.");

        // Dunkelweizen
        values.put(Database.TYPE[1], 23);
        values.put(Database.TYPE[2], "Dunkelweizen");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Dunkelweizen.");

        // Irish Dry Stout
        values.put(Database.TYPE[1], 24);
        values.put(Database.TYPE[2], "Irish Dry Stout");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Irish Dry Stout.");

        // Doppelbock
        values.put(Database.TYPE[1], 25);
        values.put(Database.TYPE[2], "Doppelbock");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Doppelbock.");

        // Porter
        values.put(Database.TYPE[1], 26);
        values.put(Database.TYPE[2], "Porter");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Porter.");

        // Stout
        values.put(Database.TYPE[1], 27);
        values.put(Database.TYPE[2], "Stout");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Stout.");

        // Foreign Stout
        values.put(Database.TYPE[1], 28);
        values.put(Database.TYPE[2], "Foreign Stout");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Foreign Stout.");

        // Baltic Porter
        values.put(Database.TYPE[1], 29);
        values.put(Database.TYPE[2], "Baltic Porter");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Baltic Porter.");

        // Imperial Stout
        values.put(Database.TYPE[1], 30);
        values.put(Database.TYPE[2], "Imperial Stout");
        db.insert(Database.TABLES[3], null, values);
        Log.i(TAG, "Inserting Imperial Stout.");
    }

    // Insert default data for Continent
    public static void InsertContinent(SQLiteDatabase db) {
        values.clear();

        // Africa
        values.put(Database.CONTINENT[1], 2);
        values.put(Database.CONTINENT[2], "Africa");
        values.put(Database.CONTINENT[3], "Africa");
        values.put(Database.CONTINENT[4], "�?frica");
        values.put(Database.CONTINENT[5], "Afrique");
        values.put(Database.CONTINENT[6], "�?frica");
        db.insert(Database.TABLES[4], null, values);
        Log.i(TAG, "Inserting Africa.");

        // Oceania
        values.put(Database.CONTINENT[1], 9);
        values.put(Database.CONTINENT[2], "Oceania");
        values.put(Database.CONTINENT[3], "Oceania");
        values.put(Database.CONTINENT[4], "Oceanía");
        values.put(Database.CONTINENT[5], "Océanie");
        values.put(Database.CONTINENT[6], "Oceania");
        db.insert(Database.TABLES[4], null, values);
        Log.i(TAG, "Inserting Oceania.");

        // Americas
        values.put(Database.CONTINENT[1], 12);
        values.put(Database.CONTINENT[2], "Americas");
        values.put(Database.CONTINENT[3], "Americhe");
        values.put(Database.CONTINENT[4], "Américas");
        values.put(Database.CONTINENT[5], "Amériques");
        values.put(Database.CONTINENT[6], "Américas");
        db.insert(Database.TABLES[4], null, values);
        Log.i(TAG, "Inserting Americas.");

        // Asia
        values.put(Database.CONTINENT[1], 142);
        values.put(Database.CONTINENT[2], "Asia");
        values.put(Database.CONTINENT[3], "Asia");
        values.put(Database.CONTINENT[4], "Asia");
        values.put(Database.CONTINENT[5], "Asia");
        values.put(Database.CONTINENT[6], "Asia");
        db.insert(Database.TABLES[4], null, values);
        Log.i(TAG, "Inserting Asia.");

        // Europe
        values.put(Database.CONTINENT[1], 150);
        values.put(Database.CONTINENT[2], "Europe");
        values.put(Database.CONTINENT[3], "Europe");
        values.put(Database.CONTINENT[4], "Europe");
        values.put(Database.CONTINENT[5], "Europe");
        values.put(Database.CONTINENT[6], "Europe");
        db.insert(Database.TABLES[4], null, values);
        Log.i(TAG, "Inserting Europe.");
    }

    // Insert default data for Area
    public static void InsertArea(SQLiteDatabase db) {
        values.clear();

        // South America
        values.put(Database.AREA[1], 5);
        values.put(Database.AREA[2], 19);
        values.put(Database.AREA[3], "South America");
        values.put(Database.AREA[4], "Sud America");
        values.put(Database.AREA[5], "Sud America");
        values.put(Database.AREA[6], "Amérique du Sud");
        values.put(Database.AREA[7], "América do Sul");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting South America.");

        // Western Africa
        values.put(Database.AREA[1], 11);
        values.put(Database.AREA[2], 2);
        values.put(Database.AREA[3], "Western Africa");
        values.put(Database.AREA[4], "Africa Occidentale");
        values.put(Database.AREA[5], "�?frica Occidental");
        values.put(Database.AREA[6], "Afrique de l'Ouest");
        values.put(Database.AREA[7], "�?frica Ocidental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Western Africa.");

        // Central America
        values.put(Database.AREA[1], 13);
        values.put(Database.AREA[2], 19);
        values.put(Database.AREA[3], "Central America");
        values.put(Database.AREA[4], "America Centrale");
        values.put(Database.AREA[5], "América Central");
        values.put(Database.AREA[6], "Amérique Centrale");
        values.put(Database.AREA[7], "América Central");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Central America.");

        // Eastern Africa
        values.put(Database.AREA[1], 14);
        values.put(Database.AREA[2], 2);
        values.put(Database.AREA[3], "Eastern Africa");
        values.put(Database.AREA[4], "Africa Orientale");
        values.put(Database.AREA[5], "�?frica del Este");
        values.put(Database.AREA[6], "Afrique de l'Est");
        values.put(Database.AREA[7], "�?frica Oriental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Eastern Africa.");

        // Northern Africa
        values.put(Database.AREA[1], 15);
        values.put(Database.AREA[2], 2);
        values.put(Database.AREA[3], "Northern Africa");
        values.put(Database.AREA[4], "Africa del Nord");
        values.put(Database.AREA[5], "�?frica del Norte");
        values.put(Database.AREA[6], "Afrique du Nord");
        values.put(Database.AREA[7], "Norte de �?frica");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Northern Africa.");

        // Middle Africa
        values.put(Database.AREA[1], 17);
        values.put(Database.AREA[2], 2);
        values.put(Database.AREA[3], "Middle Africa");
        values.put(Database.AREA[4], "Africa Centrale");
        values.put(Database.AREA[5], "�?frica Central");
        values.put(Database.AREA[6], "Afrique Centrale");
        values.put(Database.AREA[7], "�?frica Central");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Middle Africa.");

        // Southern Africa
        values.put(Database.AREA[1], 18);
        values.put(Database.AREA[2], 2);
        values.put(Database.AREA[3], "Southern Africa");
        values.put(Database.AREA[4], "Africa del Sud");
        values.put(Database.AREA[5], "�?frica del Sur");
        values.put(Database.AREA[6], "Afrique du Sud");
        values.put(Database.AREA[7], "Sud da �?frica");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Southern Africa.");

        // North America
        values.put(Database.AREA[1], 21);
        values.put(Database.AREA[2], 19);
        values.put(Database.AREA[3], "North America");
        values.put(Database.AREA[4], "America del Nord");
        values.put(Database.AREA[5], "América del Norte");
        values.put(Database.AREA[6], "Amérique du Nord");
        values.put(Database.AREA[7], "América do Norte");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting North America.");

        // Caribbean
        values.put(Database.AREA[1], 29);
        values.put(Database.AREA[2], 19);
        values.put(Database.AREA[3], "Caribbean");
        values.put(Database.AREA[4], "Caraibi");
        values.put(Database.AREA[5], "Caribe");
        values.put(Database.AREA[6], "Caraïbes");
        values.put(Database.AREA[7], "Caribe");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Caribbean.");

        // Eastern Asia
        values.put(Database.AREA[1], 30);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "Eastern Asia");
        values.put(Database.AREA[4], "Asia Orientale");
        values.put(Database.AREA[5], "Asia del Este");
        values.put(Database.AREA[6], "Asie de l'Est");
        values.put(Database.AREA[7], "�?sia Oriental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Eastern Asia.");

        // Southern Asia
        values.put(Database.AREA[1], 34);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "Southern Asia");
        values.put(Database.AREA[4], "Asia del Sud");
        values.put(Database.AREA[5], "Asia del Sur");
        values.put(Database.AREA[6], "Asie du Sud");
        values.put(Database.AREA[7], "Sul da �?sia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Southern Asia.");

        // South-Eastern Asia
        values.put(Database.AREA[1], 35);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "South-Eastern Asia");
        values.put(Database.AREA[4], "Asia Sud-orientale");
        values.put(Database.AREA[5], "Asia Sud-oriental");
        values.put(Database.AREA[6], "Asie du Sud-Est");
        values.put(Database.AREA[7], "Sudeste da �?sia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting South-Eastern Asia.");

        // Southern Europe
        values.put(Database.AREA[1], 39);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "Southern Europe");
        values.put(Database.AREA[4], "Europa del sud");
        values.put(Database.AREA[5], "Sur de Europa");
        values.put(Database.AREA[6], "Europe du Sud");
        values.put(Database.AREA[7], "Sul da Europa");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Southern Europe.");

        // Australia and New Zealand
        values.put(Database.AREA[1], 53);
        values.put(Database.AREA[2], 9);
        values.put(Database.AREA[3], "Australia and New Zealand");
        values.put(Database.AREA[4], "Australia e Nuova Zelanda");
        values.put(Database.AREA[5], "Australia y Nueva Zelanda");
        values.put(Database.AREA[6], "Australie et Nouvelle-Zélande");
        values.put(Database.AREA[7], "Austrália e Nova Zelândia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Australia and New Zealand.");

        // Melanesia
        values.put(Database.AREA[1], 54);
        values.put(Database.AREA[2], 9);
        values.put(Database.AREA[3], "Melanesia");
        values.put(Database.AREA[4], "Melanesia");
        values.put(Database.AREA[5], "Melanesia");
        values.put(Database.AREA[6], "Mélanésie");
        values.put(Database.AREA[7], "Melanésia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Melanesia.");

        // Micronesia
        values.put(Database.AREA[1], 57);
        values.put(Database.AREA[2], 9);
        values.put(Database.AREA[3], "Micronesia");
        values.put(Database.AREA[4], "Micronesia");
        values.put(Database.AREA[5], "Micronesia");
        values.put(Database.AREA[6], "Micronésie");
        values.put(Database.AREA[7], "Micronésia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Micronesia.");

        // Polynesia
        values.put(Database.AREA[1], 61);
        values.put(Database.AREA[2], 9);
        values.put(Database.AREA[3], "Polynesia");
        values.put(Database.AREA[4], "Polinesia");
        values.put(Database.AREA[5], "Polinesia");
        values.put(Database.AREA[6], "Polynésie");
        values.put(Database.AREA[7], "Polinésia");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Polynesia.");

        // Central Asia
        values.put(Database.AREA[1], 143);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "Central Asia");
        values.put(Database.AREA[4], "Asia Centrale");
        values.put(Database.AREA[5], "Asia Central");
        values.put(Database.AREA[6], "Asie Centrale");
        values.put(Database.AREA[7], "�?sia Central");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Central Asia.");

        // Western Asia
        values.put(Database.AREA[1], 145);
        values.put(Database.AREA[2], 142);
        values.put(Database.AREA[3], "Western Asia");
        values.put(Database.AREA[4], "Asia Occidentale");
        values.put(Database.AREA[5], "Asia Occidental");
        values.put(Database.AREA[6], "Asie de l'Ouest");
        values.put(Database.AREA[7], "�?sia Ocidental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Western Asia.");

        // Eastern Europe
        values.put(Database.AREA[1], 151);
        values.put(Database.AREA[2], 150);
        values.put(Database.AREA[3], "Eastern Europe");
        values.put(Database.AREA[4], "Europa Orientale");
        values.put(Database.AREA[5], "Europa del Este");
        values.put(Database.AREA[6], "Europe de l'Est");
        values.put(Database.AREA[7], "Europa Oriental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Eastern Europe.");

        // Northern Europe
        values.put(Database.AREA[1], 154);
        values.put(Database.AREA[2], 150);
        values.put(Database.AREA[3], "Northern Europe");
        values.put(Database.AREA[4], "Nord Europa");
        values.put(Database.AREA[5], "Norte de Europa");
        values.put(Database.AREA[6], "Europe du Nord");
        values.put(Database.AREA[7], "Norte da Europa");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Northern Europe.");

        // Western Europe
        values.put(Database.AREA[1], 155);
        values.put(Database.AREA[2], 150);
        values.put(Database.AREA[3], "Western Europe");
        values.put(Database.AREA[4], "Europa Occidentale");
        values.put(Database.AREA[5], "Europa Occidental");
        values.put(Database.AREA[6], "Europe de l'Ouest");
        values.put(Database.AREA[7], "Europa Ocidental");
        db.insert(Database.TABLES[5], null, values);
        Log.i(TAG, "Inserting Western Europe.");
    }
}
