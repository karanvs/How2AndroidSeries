package com.how24devs.jetpackcomposesamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.how24devs.jetpackcomposesamples.ui.theme.Gray700
import com.how24devs.jetpackcomposesamples.ui.theme.JetPackComposeSamplesTheme
import com.how24devs.workmanagersample.model.SampleData
import com.how24devs.workmanagersample.model.SampleRepo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    buildSampleList(list = SampleRepo.getListOfSamples())
                }
            }
        }
    }
}

@Composable
fun buildSampleList(list:List<SampleData> )
{
    LazyColumn(){
        for (data in list)
            item {
                SampleItem(data)
            }
    }
}

@Composable
fun SampleItem(sampleData: SampleData)
{
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("${sampleData.name}")
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_forward_grey_800_24dp),
                    contentDescription = "View tutorial"
                )
            }
            Text(text = "${sampleData.description}", color = Gray700)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeSamplesTheme {
        buildSampleList(list = SampleRepo.getListOfSamples())
    }
}