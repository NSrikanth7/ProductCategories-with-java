/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//window.onload = init;
var socket = new WebSocket("ws://localhost:8080/ProductCategories/actions");
socket.onopen = function(msg) {
     processOpen(msg);
 };
 function processOpen(msg){
     socket.send(msg);
     
 };
 socket.onerror = function(error) {
    console.log('Socket error: ' + error);
};
 
socket.onmessage = function(event){
        var data = JSON.parse(event.data);
        var totalData = data['menu'];
        var dynamicHtml = "";
        var childs = "";
        var subChilds = "";
        for(var m=0;m < totalData.length;m++){
            if(totalData[m].name != "" && totalData[m].name != undefined){
                dynamicHtml += "<li><a href='#'>"+totalData[m].name+"</a>";
                childs = totalData[m].childs;
                if(childs.length > 0) {
                    dynamicHtml +='<ul class="childNav" id="childNav">';
                    for(var c = 0; c < childs.length; c++){
                        dynamicHtml +='<li><a href="#">'+childs[c].name+"</a>";
                        subChilds = childs[c].childs;
                        if(subChilds.length > 0){
                            dynamicHtml +='<ul class="subChildNav" id="subChildNav">';
                            for(var s=0;s < subChilds.length;s++){
                               dynamicHtml +='<li><a href="#">';
                               dynamicHtml += subChilds[s]+"</a></li>";
                           }
                           dynamicHtml +='</ul></li>';
                           
                        } else {
                           dynamicHtml +="</li></ul>";
                        }
                      
                    }
                } else {
                   dynamicHtml +="</li>"; 
                }
            }
            dynamicHtml +="</ul></li>";  
        }
        document.getElementById("categoryNav").innerHTML = dynamicHtml;
        var subCategoryNav = document.getElementsByClassName("subChildNav");
        if(subCategoryNav.length > 0){
            for(var i=0;i < subCategoryNav.length;i++){
                    subCategoryNav[i].addEventListener("click", function(event){
                            localStorage.setItem( 'productName', event.target.innerHTML);
                            window.open("productDetails.html","_self")
                    });
            }
        }
};
 
 
