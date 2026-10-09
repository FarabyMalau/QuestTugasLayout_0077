package com.example.questtugaslayout_0077

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun KartuProfil(
    @StringRes nama: Int,
    @StringRes alamat: Int,
    @ColorRes warnaLatar: Int,
    @ColorRes warnaAlamat: Int,
    modifier: Modifier = Modifier,
    @StringRes telepon: Int? = null,
    @DrawableRes logo: Int = R.drawable.logo_umy,
    @IntegerRes ukuranNama: Int = R.integer.ukuran_nama,
    fontNama: FontFamily = FontFamily.Default,
    bobotNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.margin_kartu_horizontal),
                vertical = dimensionResource(R.dimen.margin_kartu_vertikal)
            ),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warnaLatar)
        )
    ) {
        Row(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_isi_kartu)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(logo),
                contentDescription = stringResource(R.string.deskripsi_logo),
                modifier = Modifier
                    .size(dimensionResource(R.dimen.ukuran_logo))
                    .padding(dimensionResource(R.dimen.padding_logo))
            )
        }
    }
}
