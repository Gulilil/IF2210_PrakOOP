#include "ArtistUser.h"
#include <iostream>

using namespace std;

int ArtistUser::num_of_artist = 0;

ArtistUser::ArtistUser(char* name) : User(name) {
    this->num_of_music_uploaded = 0;
    this->uploaded_music_list = new char*[3000];
    ArtistUser::num_of_artist++;
}

ArtistUser::ArtistUser(const ArtistUser& au) : User(au){
    this->num_of_music_uploaded = au.num_of_music_uploaded;
    this->uploaded_music_list = new char*[3000];

    for (int i = 0; i < this->num_of_music_uploaded; i++){
        this->uploaded_music_list[i] = new char[strlen(au.uploaded_music_list[i])];
        strcpy(this->uploaded_music_list[i], au.uploaded_music_list[i]);
    }
    ArtistUser::num_of_artist++;
}

ArtistUser::~ArtistUser() {
    delete[] this->uploaded_music_list;
    cout << "Artist user " << this->name << " deleted" << endl;
}

void ArtistUser::uploadMusic(char* music){
    this->uploaded_music_list[num_of_music_uploaded] = new char [strlen(music)];
    strcpy(this->uploaded_music_list[num_of_music_uploaded], music);
    this->num_of_music_uploaded++;
}

void ArtistUser::deleteUploadedMusic(char* delMus){
    int idx = -1;
    int i = 0;
    while (idx == -1 && i < this->num_of_music_uploaded){
        if (strcmp(delMus, this->uploaded_music_list[i]) == 0){
            idx = i;
        } else {
            i++;
        }
    }

    if (idx == -1){
        return;
    }

    for (int j = idx; j < this->num_of_music_uploaded -1; j++){
        this->uploaded_music_list[j] = new char[strlen(this->uploaded_music_list[j+1])];
        strcpy(this->uploaded_music_list[j], this->uploaded_music_list[j+1]);
    }

    num_of_music_uploaded--;
}

void ArtistUser::viewUploadedMusicList() const {
    if (this->num_of_music_uploaded == 0){
        cout << "No music uploaded" << endl;
    } else {
        for (int i = 0; i < this->num_of_music_uploaded; i++){
            cout << i+1 << ". " << this->uploaded_music_list[i] << endl;
        }
    }
}

int ArtistUser::getNumOfMusicUploaded() const{
    return this->num_of_music_uploaded;
}

int ArtistUser::getNumOfArtist() {
    return ArtistUser::num_of_artist;
}