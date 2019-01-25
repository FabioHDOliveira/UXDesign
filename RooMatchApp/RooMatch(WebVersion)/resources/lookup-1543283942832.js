(function(window, undefined) {
  var dictionary = {
    "83092871-da94-4073-8772-940d3c32c96f": "Chat_Janis1",
    "837ad0e2-90b2-44f0-a030-57e0c5e384dd": "CreateAccount",
    "5c6ef160-c3dc-4e6c-bf6a-a57891da5ec3": "Profile",
    "e6623568-534d-4d6a-a1bb-6663861750ba": "Match",
    "80c8ad96-1ff3-46c9-825c-005565bbbc40": "LoginError",
    "6a8a9471-8af3-4719-b77f-d9be26d269ed": "IconScreen",
    "4c8ec899-1a78-41d1-a4ab-d0318b0b2583": "Chat_Spidey1",
    "9fbb4608-da32-408c-b98e-7c0f5247ad22": "ProfileFB",
    "400e3bf6-f63e-4da6-9e60-e206ce106142": "Chat_Fabio",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "Login",
    "089bc702-12a6-448d-a6de-329e4fa0c870": "Chat_Janis",
    "307608e5-6a9d-4aef-a1ec-976fcd7e45c2": "MateInfo",
    "4c9454b9-b0bc-4f77-8f1a-42d1be8bde87": "Chat_Mark",
    "1928f99e-545c-446d-b046-1eb234db316b": "Chat_Spidey",
    "2ada932d-5e4a-423b-b83d-e4de181147f3": "PostApart",
    "e3f5814f-e6ef-40b9-96b1-7169bb19fd07": "CreateAccountPart2",
    "0c14ad5b-3893-4c97-a405-5d4af9298588": "ApartInfo",
    "1f852efe-6b21-4e5e-bcb9-f49a47ffd306": "Chat",
    "20572059-085c-4a97-9ece-46eb6c22e215": "Home",
    "5c0114fa-6369-412e-8a5a-7983ad912beb": "ApartmentList",
    "3c46e890-7c3c-4ebb-935d-83436726e9e4": "signupcomplete",
    "7ae3fb39-bc70-4cc2-8d98-8d7c22c48946": "960 grid - 16 columns",
    "0c797cae-8a8a-467d-934d-5922cde34c86": "Template 1 imported",
    "fad77ce2-9881-48b0-a8c8-39ee65c6d5c6": "960 grid - 12 columns",
    "f39803f7-df02-4169-93eb-7547fb8c961a": "Template 1",
    "eddb4b6e-6be6-47da-bed8-8bda799a51b3": "Template 1 imported_1",
    "bb8abf58-f55e-472d-af05-a7d1bb0cc014": "default",
    "6d36dc77-2250-4cf9-b6d5-c77510c54297": "default imported_1",
    "c1815d7e-bcf2-4d7f-9fcc-d87cb97392cf": "default imported"
  };

  var uriRE = /^(\/#)?(screens|templates|masters|scenarios)\/(.*)(\.html)?/;
  window.lookUpURL = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, url;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      url = folder + "/" + canvas;
    }
    return url;
  };

  window.lookUpName = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, canvasName;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      canvasName = dictionary[canvas];
    }
    return canvasName;
  };
})(window);