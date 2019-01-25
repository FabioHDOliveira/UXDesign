function initData() {
  jimData.variables["college"] = "";
  jimData.variables["birthday"] = "";
  jimData.variables["pictureprofile"] = "";
  jimData.variables["firstname"] = "";
  jimData.variables["gender"] = "";
  jimData.variables["city"] = "";
  jimData.variables["apartpicture"] = "";
  jimData.variables["apartprofpicture"] = "";
  jimData.variables["studentid"] = "";
  jimData.variables["password"] = "";
  jimData.variables["chat-text"] = "";
  jimData.variables["surname"] = "";
  jimData.variables["street"] = "";
  jimData.variables["price"] = "";
  jimData.variables["apartprofile"] = "";
  jimData.variables["term"] = "";
  jimData.variables["Row"] = "0";
  jimData.variables["toggle-variable"] = "2";
  jimData.variables["email"] = "";
  jimData.datamasters["Chat"] = [
    {
      "id": 1,
      "datamaster": "Chat",
      "userdata": {
        "Text": "Hi, what\u2019s going on?",
        "Time": "sample text",
        "toggle": ""
      }
    }
  ];

  jimData.datamasters["UserInfo"] = [
    {
      "id": 1,
      "datamaster": "UserInfo",
      "userdata": {
        "FIRST NAME": "sample text",
        "LAST NAME": "sample text",
        "EMAIL ADDRESS": "sample text",
        "STUDENT ID": "1234",
        "PASSWORD": "1234",
        "BIRTHDAY": "09/12/2011",
        "COLLEGE": "sample text",
        "TERM": "sample text",
        "GENDER": "sample text",
        "PICPROFILE": "./resources/_jim/images/common/crossimage.png"
      }
    }
  ];

  jimData.datamasters["ApartList"] = [
    {
      "id": 1,
      "datamaster": "ApartList",
      "userdata": {
        "City": "New Westminster",
        "Street": "6th Street, 162",
        "Price": "$800",
        "Picture": "./images/33fe6702-eb35-476a-b165-42085a2228f8.jpg",
        "Profile": "Seage Holly",
        "PictureProfile": "./images/bb4919d4-42af-4e6f-bc30-4a29d8fb4654.png"
      }
    },
    {
      "id": 2,
      "datamaster": "ApartList",
      "userdata": {
        "City": "New Westminster",
        "Street": "Columbia Street, 125",
        "Price": "$400",
        "Picture": "./images/eedb15ad-ee2e-4dbe-82c0-2624f8c11318.jpg",
        "Profile": "Moralis Eleni",
        "PictureProfile": "./images/faf38fed-c55b-4053-8d22-eba434d1e57d.png"
      }
    },
    {
      "id": 3,
      "datamaster": "ApartList",
      "userdata": {
        "City": "Surrey",
        "Street": "144 St, 342",
        "Price": "$500",
        "Picture": "./images/47f1d380-a09a-41ee-a2ad-1120358f5a94.jpg",
        "Profile": "Godman Sumner",
        "PictureProfile": "./images/756e52b7-00ac-4b63-aad9-3b5d629399b4.png"
      }
    },
    {
      "id": 4,
      "datamaster": "ApartList",
      "userdata": {
        "City": "Langley",
        "Street": "Logan Ave, 121",
        "Price": "$600",
        "Picture": "./images/944cb70e-3f13-4661-b393-449c1f4c2b80.jpg",
        "Profile": "Cranney Bradley",
        "PictureProfile": "./images/e1f5fe34-47ad-426b-bc87-7b06c9ee1493.png"
      }
    },
    {
      "id": 5,
      "datamaster": "ApartList",
      "userdata": {
        "City": "Surrey",
        "Street": "Boundary Dr., 232",
        "Price": "$300",
        "Picture": "./images/8c72afc1-6598-4d28-9b73-a9e37726f3a6.jpg",
        "Profile": "Winear Hailey",
        "PictureProfile": "./images/dc596bcf-d675-4805-8314-de67fa48a329.png"
      }
    },
    {
      "id": 6,
      "datamaster": "ApartList",
      "userdata": {
        "City": "New Westminster",
        "Street": "Ash Street, 12",
        "Price": "$550",
        "Picture": "./images/9eebca21-b035-4879-ac9b-5e89af7621d8.jpg",
        "Profile": "Mobbs Shannon",
        "PictureProfile": "./images/acb30ac8-aec7-491b-8636-b02197dbe7d7.png"
      }
    }
  ];

  jimData.isInitialized = true;
}