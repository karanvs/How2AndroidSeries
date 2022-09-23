package com.how24devs.workmanagersample.model

object SampleRepo {

    fun getListOfSamples():ArrayList<SampleData>{
        return ArrayList<SampleData>().apply {
            add(SampleData("1", "Hello Android !","Sample to demonstrate to add dependencies and show a basic text"))
            add(SampleData("2", "Widgets","Sample to demonstrate to usage of widget and how to define their properties"))
            add(SampleData("3", "Recomposition","Sample to demonstrate how recomposition works and how to do it"))
            add(SampleData("4", "State","Sample to demonstrate various techniques like state hoisting, surviving configurations"))
            add(SampleData("5", "View Model","Sample to demonstrate view model's role and how to use it"))
            add(SampleData("6", "Dark Mode","Sample to demonstrate how to support dark mode"))
            add(SampleData("7", "Animations","Sample to demonstrate how to create "))
            add(SampleData("8", "Navigation","Sample to demonstrate how to support common navigational widgets and how to navigate"))
            add(SampleData("9", "Multi Screen support","Sample to demonstrate how to build flexible layout that supports multiple screens"))
            add(SampleData("10", "Deep Dive","Sample to demonstrate the intricacy of compose and how to use to avoid unnecessary recomposition"))
            add(SampleData("11", "Testing","Sample to demonstrate various testing techniques for compose"))
            add(SampleData("12", "Common layouts","Sample to demonstrate various common layouts like lists, grids"))
        }
    }

}