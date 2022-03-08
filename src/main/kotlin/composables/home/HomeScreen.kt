package composables.home

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(

) {
    HomeContent(
        items = listOf(
            CategoryList(0, "Work"),
            CategoryList(1, "University"),
            CategoryList(2, "Personal")
        )
    )
}

@Composable
fun HomeContent(
    items: List<CategoryList>
) {
    Row(

    ) {
        Column(
            modifier = Modifier
                .weight(0.35f)
                .fillMaxSize()
                .border(width = 2.dp, color = Color.Black),
            horizontalAlignment = Alignment.End
        ) {
            LazyColumn(
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(space = 8.dp),
                contentPadding = PaddingValues(all = 8.dp)
            ) {
                items(items, key = { item -> item.id }) { categoryList ->
                    CategoryCardItem(categoryList = categoryList)
                }
            }
            IconButton(
                modifier = Modifier
                    .weight(0.1f)
                    .padding(all = 8.dp)
                    .background(
                        shape = CircleShape,
                        color = Color.Magenta
                    ),
                onClick = {}
            ) {
                Image(
                    modifier = Modifier.padding(all = 12.dp),
                    painter = painterResource("images/add.png"),
                    contentDescription = "Add Category"
                )
            }
        }
        Column(
            modifier = Modifier
                .weight(0.65f)
                .fillMaxSize()
                .border(width = 2.dp, color = Color.Black)
        ) {

        }
    }
}

@Composable
fun CategoryCardItem(
    categoryList: CategoryList
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(width = 1.dp, color = Color.Black),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .background(color = Color.Gray, shape = RoundedCornerShape(size = 8.dp))
            .clip(shape = RoundedCornerShape(size = 8.dp))
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
            text = categoryList.name,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview()
fun wHomeContentPreview() {
    HomeContent(
        items = listOf(
            CategoryList(0, "Work"),
            CategoryList(1, "University"),
            CategoryList(2, "Personal")
        )
    )
}