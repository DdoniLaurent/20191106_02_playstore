package com.tioeun.a20191106_02_playstore.datas

import java.io.Serializable

class PlayStoreData(inputName:String, inputComp:String) : Serializable {

    var name = inputName
    var comp = inputComp
}