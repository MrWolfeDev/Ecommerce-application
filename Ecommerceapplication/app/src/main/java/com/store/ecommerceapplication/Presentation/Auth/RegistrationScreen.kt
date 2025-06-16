package com.store.ecommerceapplication.Presentation.Auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.store.ecommerceapplication.R

@Composable
fun SignupScreenSource() {
    var UserNameAndEmail by remember { mutableStateOf("") }
    var UserPassword by remember { mutableStateOf("") }
    var UserConfPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Top Section - Create Account Text
        Column {
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                "Create an\naccount",
                fontSize = 42.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(start = 15.dp, bottom = 20.dp),
                letterSpacing = 0.5.sp
            )
        }

        // Middle Section - Input Fields and Create Account Button
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Username/Email Input Field
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(shape = RoundedCornerShape(10.dp), color = Color(0xFFB2B2B2), width = 2.dp)
                    .height(70.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFF3F3F3))
            ) {
                Icon(
                    Icons.Default.Person,
                    contentDescription = "user icon",
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .align(Alignment.CenterStart)
                        .size(25.dp)
                )
                TextField(
                    value = UserNameAndEmail,
                    onValueChange = { UserNameAndEmail = it },
                    modifier = Modifier
                        .padding(start = 45.dp, end = 45.dp)
                        .fillMaxSize(),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Username or Email",
                            fontSize = 14.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        letterSpacing = 0.5.sp
                    )
                )
            }

            // Password Input Field
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(shape = RoundedCornerShape(10.dp), color = Color(0xFFB2B2B2), width = 2.dp)
                    .height(70.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFF3F3F3))
            ) {
                Icon(
                    painter = painterResource(R.drawable.lock),
                    tint = Color.Black,
                    contentDescription = "Password lock icon",
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .align(Alignment.CenterStart)
                        .size(25.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.visibility),
                    tint = Color.Black,
                    contentDescription = "Visibility",
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .align(Alignment.CenterEnd)
                        .size(25.dp)
                )
                TextField(
                    value = UserPassword,
                    onValueChange = { UserPassword = it },
                    modifier = Modifier
                        .padding(start = 45.dp, end = 45.dp)
                        .fillMaxSize(),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Password",
                            fontSize = 14.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        letterSpacing = 0.5.sp
                    )
                )
            }

            // Confirm Password Input Field
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(shape = RoundedCornerShape(10.dp), color = Color(0xFFB2B2B2), width = 2.dp)
                    .height(70.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFF3F3F3))
            ) {
                Icon(
                    painter = painterResource(R.drawable.lock),
                    tint = Color.Black,
                    contentDescription = "Password lock icon",
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .align(Alignment.CenterStart)
                        .size(25.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.visibility),
                    tint = Color.Black,
                    contentDescription = "Visibility",
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .align(Alignment.CenterEnd)
                        .size(25.dp)
                )
                TextField(
                    value = UserConfPassword,
                    onValueChange = { UserConfPassword = it },
                    modifier = Modifier
                        .padding(start = 45.dp, end = 45.dp)
                        .fillMaxSize(),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Confirm Password",
                            fontSize = 14.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontSize = 16.sp,
                        letterSpacing = 0.5.sp
                    )
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Create Account Button
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(5.dp))
                    .height(70.dp)
                    .fillMaxWidth()
                    .background(Color(0xFF8817C6))
            ) {
                Text(
                    text = "Create Account",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.align(Alignment.Center),
                    letterSpacing = 0.5.sp
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // OR Continue with Text
            Text(
                text = "-OR Continue with-",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.5.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Social Media Icons Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .border(width = 2.dp, color = Color(0xFFB437F8), shape = CircleShape)
                ) {
                    Image(
                        painter = painterResource(R.drawable.googleicon),
                        contentDescription = "Google Icon",
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .border(width = 2.dp, color = Color(0xFFB437F8), shape = CircleShape)
                ) {
                    Image(
                        painter = painterResource(R.drawable.facbookicon),
                        contentDescription = "FaceBook Icon",
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .border(width = 2.dp, color = Color(0xFFB437F8), shape = CircleShape)
                ) {
                    Image(
                        painter = painterResource(R.drawable.appleiphone),
                        contentDescription = "apple Icon",
                        modifier = Modifier
                            .padding(5.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }

        // Bottom Section - Login Text
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Already have an account?",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Login",
                    color = Color(0xFFB437F8),
                    fontSize = 14.sp,
                    letterSpacing = 0.5.sp,
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SignupScreen() {
    SignupScreenSource()
}