package dev.raju.consumrz.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

/**
 * Created by Rajashekhar Vanahalli on 08 June, 2023
 */
@Composable
fun PostComponent() {
    // Post section
    Card(
        colors = CardDefaults.cardColors(containerColor = CardBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.lorem_ipsum_title),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.weight(1f)
                )

                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Edit,
                        contentDescription = "Edit"
                    )
                }

                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = "Delete"
                    )
                }
            }

            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(
                text = stringResource(id = R.string.lorem_ipsum_description),
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier
                    .align(Alignment.Start)
            )
            /*Spacer(modifier = Modifier.padding(vertical = 16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val commentText = if (comments.isNotEmpty()) {
                pluralStringResource(
                    id = R.plurals.total_comments,
                    count = comments.size,
                    comments.size
                )
            } else {
                stringResource(id = R.string.comments)
            }
            Text(
                text = commentText,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(2.dp)
            )

            IconButton(
                onClick = {
                    navigator.navigate(
                        AddCommentScreenDestination(
                            postId = post.id,
                            comment = null
                        )
                    )
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add"
                )
            }
        }

        if (comments.isEmpty()) {
            Column(
                Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = stringResource(R.string.no_comments_found),
                    style = MaterialTheme.typography.titleMedium,
                )
            }
        } else {
            Column(
                Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                LazyColumn(state = listState) {
                    items(items = comments) { comment ->
                        CommentItem(
                            navigator = navigator,
                            viewModel = viewModel,
                            comment = comment,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                                .selectable(
                                    selected = comment.id == selectedIndex,
                                    onClick = {
                                        selectedIndex =
                                            if (selectedIndex != comment.id)
                                                comment.id!! else -1
                                        scope.launch {
                                            snackbarHostState.showSnackbar("Selected index: $selectedIndex")
                                        }
                                        navigator.navigate(
                                            AddCommentScreenDestination(
                                                postId = post.id,
                                                comment = comment
                                            )
                                        )
                                    })
                        )
                    }
                }
            }
        }*/
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostComponentPreview() {
    ConsumrzUITheme {
        PostComponent()
    }
}