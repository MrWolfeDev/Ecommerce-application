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
fun LoginScreenSource() {
    var userNameAndEmail by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Top Section - Welcome Text
        Column {
            Spacer(modifier = Modifier.height(80.dp))
            Text(
                "Welcome\nBack!",
                fontSize = 42.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(start = 15.dp),
                letterSpacing = 0.5.sp
            )
        }

        // Middle Section - Input Fields and Login Button
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
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
                    value = userNameAndEmail,
                    onValueChange = { userNameAndEmail = it },
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
                        letterSpacing = 0.5.sp,
                        color = Color.Black
                    )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

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
                    value = userPassword,
                    onValueChange = { userPassword = it },
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

            Spacer(modifier = Modifier.height(20.dp))

            // Forgot Password Text
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "Forgot Password?",
                    color = Color(0xFFB437F8),
                    fontSize = 14.sp,
                    letterSpacing = 0.5.sp
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Login Button
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(5.dp))
                    .height(70.dp)
                    .fillMaxWidth()
                    .background(Color(0xFF8817C6))
            ) {
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.align(Alignment.Center),
                    letterSpacing = 0.5.sp
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            // OR Continue with Text
            Text(
                text = "-OR Continue with-",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.5.sp
            )

            Spacer(modifier = Modifier.height(30.dp))

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

        // Bottom Section - Sign Up Text
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Create And Account",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Sign up",
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
fun LoginScreen() {
    LoginScreenSource()
}