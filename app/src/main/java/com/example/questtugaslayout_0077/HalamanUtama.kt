package com.example.questtugaslayout_0077

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

@Composable
fun HalamanUtama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = dimensionResource(R.dimen.jarak_atas_halaman)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = integerResource(R.integer.ukuran_judul).sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = integerResource(R.integer.ukuran_subjudul).sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_judul_ke_kartu)))
        KartuProfil(
            nama = R.string.nama_1,
            alamat = R.string.alamat_1,
            warnaLatar = R.color.card_1_bg,
            warnaAlamat = R.color.teks_kuning,
            ukuranNama = R.integer.ukuran_nama_cursive,
            fontNama = FontFamily.Cursive,
            bobotNama = FontWeight.Normal
        )
        KartuProfil(
            nama = R.string.nama_2,
            telepon = R.string.telepon_2,
            alamat = R.string.alamat_2,
            warnaLatar = R.color.card_2_bg,
            warnaAlamat = R.color.teks_kuning
        )
        KartuProfil(
            nama = R.string.nama_3,
            telepon = R.string.telepon_3,
            alamat = R.string.alamat_3,
            warnaLatar = R.color.card_3_bg,
            warnaAlamat = R.color.teks_putih
        )
        KartuProfil(
            nama = R.string.nama_4,
            telepon = R.string.telepon_4,
            alamat = R.string.alamat_4,
            warnaLatar = R.color.card_4_bg,
            warnaAlamat = R.color.teks_putih
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(R.string.copy),
            fontSize = integerResource(R.integer.ukuran_copy).sp,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.jarak_bawah_halaman))
        )
    }
}