package com.avanade.recyclerview.data

import com.avanade.recyclerview.R
import com.avanade.recyclerview.model.Avenger

class Datasource {
    fun loadAvengers() : List<Avenger>{
        return listOf<Avenger>(
            Avenger(R.string.avenger1, R.drawable.ironman),
            Avenger(R.string.avenger2, R.drawable.capamerica),
            Avenger(R.string.avenger3, R.drawable.thor),
            Avenger(R.string.avenger4, R.drawable.hulk),
            Avenger(R.string.avenger5, R.drawable.blackwidow),
            Avenger(R.string.avenger6, R.drawable.hawkeye),
            Avenger(R.string.avenger7, R.drawable.vision),
            Avenger(R.string.avenger8, R.drawable.scarletwitch),
            Avenger(R.string.avenger9, R.drawable.antman),
            Avenger(R.string.avenger10, R.drawable.wasp),
            Avenger(R.string.avenger11, R.drawable.warmachine),
            Avenger(R.string.avenger12, R.drawable.spider),
            Avenger(R.string.avenger13, R.drawable.wintersoldier),
            Avenger(R.string.avenger14, R.drawable.blackpanther),
            Avenger(R.string.avenger15, R.drawable.strange)
        )
    }
}