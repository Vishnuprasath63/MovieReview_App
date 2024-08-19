import React, { useState } from 'react'
import { useLocation } from 'react-router-dom';
import ReactPlayer from 'react-player';
import './view.css';

function View() {
    let location = useLocation();
    const [review, setReview] = useState('')
    const [reviewList, setReviewList] = useState(["super"])
    // async function getReviews() {
    //     try {
    //         let response = await axios.get('');
    //         setReviewList(response.data.reviews)
    //     } catch (error) {
    //         console.error(error);
    //     }
    // }

    // useEffect(() => {
        // getReviews()
    // }, [])


    return (
        
        <div className='container'>
    <div className='poster-section'>
        <h1>Review</h1>
        <h2>{location.state.Title}</h2>
        <img src={location.state.Poster} alt='Movie Poster' />
    </div>

    <div className='review-section'>
        {location?.state?.Trailer ?
            <ReactPlayer controls={true} playing={false} url={location.state.Trailer} /> : <></>
        }
        <h3>Type your reviews here:</h3>
        <textarea value={review} onChange={(e) => {
            if (e.target.value !== '') {
                setReview(e.target.value);
            }
        }} />
        <button onClick={() => {
            setReviewList([...reviewList, review]);
            setReview('');
        }}>
            Submit
        </button>

        {reviewList.map((review, index) => (
            <div key={index} className='review-item'>
                <div>{review}</div>
            </div>
        ))}
    </div>
</div>


    )
}
export default View