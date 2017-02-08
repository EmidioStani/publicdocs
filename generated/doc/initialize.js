    $("#toc").toc({content: "#mybody", headings: "h3,h4,h5"});
    


 // ===== Scroll to Top ==== 
    $(window).scroll(function() {
        if ($(this).scrollTop() >= $('#h2_toc').offset().top ) {        // If page is scrolled more than 50px
            $('#return-to-top').fadeIn(200);    // Fade in the arrow
        } else {
            $('#return-to-top').fadeOut(200);   // Else fade out the arrow
        }
    });
    $('#return-to-top').click(function() {      // When arrow is clicked
        $('body,html').animate({
        	
            scrollTop : $('#h2_toc').offset().top                       // Scroll to top of body
        }, 500);
    });
    
	$(document).ready(function() {
	    $cellsDataType = $('.generatedTable td:nth-child(4)');
	    $cellsDataType.each(function( index ) {
	    	  
	    	  celltext = $( this ).text();
	    	  console.log(celltext);
	    	  if (!String.prototype.startsWith) {
	    		    String.prototype.startsWith = function(searchString, position){
	    		      position = position || 0;
	    		      return this.substr(position, searchString.length) === searchString;
	    		  };
	    	  }
	    	  if ( (celltext.startsWith("pdc:")) || (celltext.startsWith("forms:")) ) {
	    		  cellvalue = celltext.split(":")[1];
	    		  $( this ).html("<a href='#"+cellvalue+"'>"+celltext+"</a>");
	    	  }
	    	});
	    
	    $('.generatedTable').DataTable( {
	    	"paging":   false,
	    	"info":     false,
	    	"searching": false,
	        responsive: {
	            details: {
	                display: $.fn.dataTable.Responsive.display.modal( {
	                    header: function ( row ) {
	                        var data = row.data();
	                        return 'Details for '+data[0]+' '+data[1];
	                    }
	                } ),
	                renderer: $.fn.dataTable.Responsive.renderer.tableAll( {
	                    tableClass: 'table'
	                } )
	            }
	        }
	    } );
	} );